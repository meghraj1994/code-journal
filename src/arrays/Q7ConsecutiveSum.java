package arrays;

public class Q7ConsecutiveSum {
    public static void main(String[] args) {
        int[] nums = {1, 8, 6, 10, 22, 3, 44};
        int target1 = 35; // true
        int target2 = 13; // false

        System.out.println(valid(nums, target1));
        System.out.println(valid(nums, target2));
    }

    public static boolean valid(int[] nums, int target) {
        int p = 0;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
         currentSum +=nums[i];
         while (currentSum > target){
             currentSum -=nums[p];
             p++;
         }
         if(target == currentSum){
             return true;
         }
        }
        return false;
    }
}
