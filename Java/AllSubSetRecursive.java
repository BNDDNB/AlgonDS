package com.test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllSubSetRecursive {
    public static List<List<Integer>> proc (int [] nums){
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<Integer>();
        perm(nums, path, 0, result);
        return result;
    }

    /*
    * the recursive function returns the value from the right-most value and then
    * expand the stacked values 
    * */
    public static void perm (int [] nums, List<Integer> path, int step, List<List<Integer>>result){
        if(step == nums.length){
            //make a copy, don't make the v
            result.add(new ArrayList<Integer>(path));
            return;
        }
        //this is to ignore the current step element and move forward
        perm(nums, path, step+1, result);
        path.add(nums[step]);
        //continue after adding the current element
        perm(nums,path,step+1,result);
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
	// write your code here
        int [] nums = {2,3,4,5};
        List<List<Integer>> result = proc(nums);
        System.out.println(result);
    }
}
