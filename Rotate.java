
class Rotate {
    public static void rotate(int[] nums,int k)
    {
        int count=0;
        k %= nums.length;
        reverse(nums,0,nums.length-1);//1.

        reverse(nums,0,k-1);//2
        reverse(nums,k,nums.length-1);

        for (int i=0;i< nums.length;i++)
        {
            System.out.print(nums[i]);
        }
        System.out.print(' ');


    }

    public static void reverse(int[] nums, int start,int end)
    {
        int temp;
        while(start<end){
            temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }


    }
}