/*the code checks for sub array that contains the maximum summation
consideration:
	instead of considering it as whether to collect next number into summary,
	consider whether the previous sum is going to be continued or to restart
	formally, s[i] = max(ele[i], ele[i]+s[i-1]) where s[i] represent state at
	i-th location, and s[i-1] represent the state prior to i-th
*/

public static int summor(int [] nums){
	if (nums.length == 0){
		//did not state what it would be for array of length of 0
		//assuming would be 0
		return 0;
	}
	int state = nums[0]
	int maxx = nums[0]
	for (int i = 0; i < nums.length; i++){
		state = Math.max(nums[i],nums[i]+state);
		maxx = Math.max(maxx, state);
	}
	return maxx;
}