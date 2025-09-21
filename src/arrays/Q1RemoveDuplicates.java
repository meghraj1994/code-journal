package arrays;

public class Q1RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int len = removeDuplicates(nums);
        System.out.println(len);
    }

    private static int removeDuplicates(int[] nums) {

        int p1=0;

        for(int i=0;i<nums.length;i++){
            if(nums[p1] != nums[i]) {
                p1++;
                nums[p1]=nums[i];
            }
        }
        return p1+1;
    }

}
