//single number 2
//given array of integers that almost all repeats 3 times but one
//find out the one
//initial thought, using hash to record the number of appearances for
//each number, then return the one that only shown once. runtime O(n),
//space O(n)
/*
creating an array of size(integer) (32 or 64 in length), and then add the
corresponding bits into position and modulo the value on the go,
runtime O(n), space O(1)
*/

public static int solver(int [] nums){
	//base case need to include no result
	if (nums.length < 3) return nums[0];
	int ilen = Integer.SIZE;
	int llen = new int [ilen];
	int result = 0;
	for (int i = 0; i < nums.length; i++){
		for (int j = 0; j < ilen; j++){
			//summing up all corresponding bits
			//and then pushing them back to 
			llen[j] += (nums[i]>>j)&1;
			llen[j] %= 3;
		}
	}
	for(int i = 0; i < ilen; i++){
		result += llen[i]<<i;
	}
	return result;
}

/*
another method is to use some characteristics on binary codes
*/

public static int solver(int [] nums){
	//bitwise operations that has the property of showing the number
	//on odd number positions
	int one = 0; two = 0; three = 0;
	for(int i : nums){
		//this shows at the even location
		two |= (one & i);
		//this only shows numbers at odd location
		one ^= i;
		//this will reset for the third 
		three = ~(one & two);
		one &= three;
		two &= three;
	}
}