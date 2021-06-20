import java.util.Arrays;

//public class Solution {
//    // 两次遍历！不够优秀！！考虑用快排的思想
//    public void moveZeroes(int[] nums) {
//        int j=0;
//        for (int i=0; i < nums.length; i++) {
//            if(nums[i]!=0){
//                nums[j++]=nums[i];
//            }
//        }
//
//        for (int s =j; s<nums.length;s++){
//            nums[s]=0;
//        }
//
//        for(int x : nums){
//            System.out.print(x);
//        }
//    }
//}

public class Solution {
    // 一次遍历！！！重要！！！
    public void moveZeroes(int[] nums) {
        int j =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j++]=temp;
            }
        }
        for(int x :nums){
            System.out.print(x);
        }
    }
}
