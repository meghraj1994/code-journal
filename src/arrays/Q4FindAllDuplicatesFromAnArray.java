package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* 1<=nums[i]<=n
*
* */

public class Q4FindAllDuplicatesFromAnArray {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1}; // o/p= {2,3}
        int[] nums1 = {1, 1, 2}; //o/p = {1};
        int[] nums2 = {1}; //o/p = {};

        for(int num : findDuplicatesUsingHashMap(nums)) System.out.print(num + " ");
        System.out.println("--------------");
        for(int num : findDuplicatesUsingHashMap(nums1)) System.out.print(num + " ");
        System.out.println("--------------");
        for(int num : findDuplicatesUsingHashMap(nums2)) System.out.print(num + " ");
        System.out.println("--------------");
        System.out.println("-------using efficient way-------");

        for(int num : findDuplicates(nums)) System.out.print(num+" ");
        System.out.println();
        for(int num : findDuplicates(nums1)) System.out.print(num+" ");
        System.out.println();
        for(int num : findDuplicates(nums2)) System.out.print(num+" ");
    }

    /*
     * Time Complexity = O(n)
     * Space Complexity = O(n)
     *
     * */
    public static List<Integer> findDuplicatesUsingHashMap(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public static List<Integer> findDuplicates(int[] nums) {

        List<Integer> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int currentValue = Math.abs(nums[i]);
            if(nums[currentValue-1] > 0) {
                nums[currentValue-1]= -nums[currentValue-1];  //marking as negative indicating current value is visited
            } else {
                result.add(currentValue);
            }
        }

        return result;
    }
}
