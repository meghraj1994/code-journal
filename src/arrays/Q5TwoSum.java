package arrays;

import java.util.HashMap;
import java.util.Map;

public class Q5TwoSum {
    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9; // [0,1]

        int[] nums2 = {3, 2, 4};
        int target2 = 6; // [1,2]

        int[] nums3 = {3, 3};
        int target3 = 6; //[0,1]

        for(int num : twoSum(nums3,target3)) System.out.print(num+" ");
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];

            if (map.containsKey(remainder)) {
                return new int[]{map.get(remainder), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[]{};
    }
}
