package com.test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    /*
    * Use binary integer to represent all permutation of the elements in array
    * */

    public static List<List<Integer>> proc (int [] nums){
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<Integer>();
        double max = Math.pow(2.0, (double)nums.length);

        for (int i = 0; i < max; i++){
            for (int j = 0; j < nums.length; j++){
                if((i& (1<<j))>0) path.add(nums[j]);
            }
            result.add(new ArrayList<>(path));
            path.clear();
        }
        return result;
    }


    public static void main(String[] args) {
	// write your code here
        int [] nums = {2,3,4,5};
        List<List<Integer>> result = proc(nums);
        System.out.println(result);
    }
}
