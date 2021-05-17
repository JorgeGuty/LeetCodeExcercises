package TwoSum;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    public static  int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> subtractions = new HashMap<>();
        int[] response = {-1, -1};
        for (int index = 0; index < nums.length; index++){
            if (subtractions.containsKey(nums[index])){
                response = new int[]{ subtractions.get(nums[index]), index};
                break;
            }
            subtractions.put(target - nums[index], index);
        }

        return response;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[]{2, 1, 11, 7}, 9)));

    }

}
