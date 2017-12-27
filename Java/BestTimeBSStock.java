//response to the 3rd version of question
//if the maximum number of times to buy sell stock is 2, then
//can split the entire array into 2 parts and find out max profit for
//each sub array by defining trough of price and find out max of each split
//this takes time of O(n-squared)
//alternatively, can scan from left, dynamically record the value of max
//then scan from right to left to find corresponding max,this then give the 
//and sum up by position to find out the max cut for the array

public static int solver(int [] prices){
    if (prices.length < 2) return 0;
    int [] l = new int [prices.length];
    int [] r = new int [prices.length];

    //prices will never be below 0
    int t = prices[0], p = prices[prices.length-1];
    int result = 0;
    l[0] = 0;
    for (int i = 1; i < prices.length; i++){
        t = Math.min(t, prices[i]);
        //cannot just compare with current max(0) here
        //if can get higher value previously, can always use the previous
        //until find better
        l[i] = Math.max(l[i-1], prices[i]-t);
    }
    r[prices.length-1] = 0;
    for (int i = prices.length -2; i >=0; i--){
        p = Math.max(p, prices[i]);
        r[i] = Math.max(r[i+1], p - prices[i]);
    }

    //range 0 -> length -1 is fine here because maximum number of trans = 2
    //so can have 1 transaction
    for (int i = 0; i < prices.length ; i++){
        result = Math.max(result, l[i] + r[i]);
    }
    return result;
}