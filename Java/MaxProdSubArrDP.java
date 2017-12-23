//this is similar to the max sum of sub array, however the max prod
//can also be obtain by two small neg numbers, see max sub for 
//state and algo setup details, so this would require of the multiply
//of the minimum number, simplification here is that the arrays are only consist of integers

public static int multor(int [] nums){
	if (nums.length == 0){
		return 0;
	}
	int statePos = nums[0];
	int stateNeg = nums[0];
	int maxx = nums[0];
	
	for (int i = 0; i < nums.length; i++){
		//min/max need to verify with 3 states
		statePos = Math.max(Math.max(nums[i], nums[i]*statePos), nums[i]*stateNeg);
		stateNeg = Math.min(Math.min(nums[i], nums[i]*stateNeg), nums[i]*statePos);
		maxx = Math.max(maxx, statePos);
	}
	return maxx;
}