//About longest increasing subsequence using brute force? and
//using DP, brute force or BFS method will take O(n!)time to complete
//using DP can solve faster
//this will be completed later
public static int solver(int [] nums){
	Queue q = new LinkedList<>();
	Q
}

//the method using DP will be below
//idea is that at ith position, the longest length is either f[i] or f[j]+1 for j < i

public static int solver(int[] nums){
    int longest = 1;
    int [] sizearr = new int [nums.length];
    //shortest is at least itself
    Arrays.fill(sizearr, 1);
    for (int i = 1; i < nums.length; i++){
        for (int j = 0; j < i; j++ ){
            if(nums[i] > nums[j]){
                //if the compared value is smaller than comparing value, then we update pos i
                sizearr[i] = Math.max(sizearr[i], sizearr[j]+1);
            }
        }
        //or replace the following with max function, whichever faster
        longest = (sizearr[i] > longest)? sizearr[i]:longest;
    }
    return longest;
}
