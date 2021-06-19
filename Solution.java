package com.Harper;

public class Solution {
    int count=0;
    public int removeDuplicates(int[] nums) {

        if(nums.length==0){
            return 0;
        }

        for(int i=1;i< nums.length;i++){
            if(nums[i]!=nums[count]){
                count++;
                nums[count]=nums[i];
            }
        }


        for (int i = 0; i <=count; i++) {
            System.out.println(nums[i]);
        }
        return count+1;
    }
}

//class Solution {
//    public int removeDuplicates(int[] nums) {
//        int n = nums.length;
//        if (n == 0) {
//            return 0;
//        }
//        int fast = 1, slow = 1;
//        while (fast < n) {
//            if (nums[fast] != nums[fast - 1]) {
//                nums[slow] = nums[fast];
//                ++slow;
//            }
//            ++fast;
//        }
//
//        for (int i = 0; i < slow; i++) {
//            System.out.println(nums[i]);
//
//        }
//        return slow;
//    }
//}




