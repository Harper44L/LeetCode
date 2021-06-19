package com.Harper;
// 我的解法：不是原地
//class Solution {
//    public void rotate(int[] nums, int k) {
//        int[] arr = new int[nums.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[(i+k)%nums.length]=nums[i];
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
//    }
//}


// 原地解法！！！超牛
class Solution {
    public void rotate(int[] nums, int k) {
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }

    public void reverse(int[] arr,int start,int end){

        int temp=0;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}

