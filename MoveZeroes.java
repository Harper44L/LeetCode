public class MoveZeroes {
    //题目要求：给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。


    //方法一：创建两个指针i和j，第一次遍历的时候指针j用来记录当前有多少非0元素。即遍历的时候每遇到一个非0元素就将其往数组左边挪，第一次遍历完后，j指针的下标就指向了最后一个非0元素下标。
    //第二次遍历的时候，起始位置就从j开始到结束，将剩下的这段区域内的元素全部置为0。

    // 感觉大概率会忘


    public int[] moveZeros1(int[] nums) {
        if (nums == null)
            return nums;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i]; //!!!!!!!!!!!!很重要 第一次遍历的时候，j指针记录非0的位置，只要是非0的统统都赋给nums[j]
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;////非0元素统计完了，剩下的都是0，所以第二次遍历把末尾的元素都赋为0即可
        }
        return nums;
    }
}


