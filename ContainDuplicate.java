import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class ContainDuplicate {
    public static boolean containsDuplicate1(int[] nums){
        //方法一：排序
        //在对数字从小到大排序之后，数组的重复元素一定出现在相邻位置中。因此，我们可以扫描已排序的数组，每次判断相邻的两个元素是否相等。
        //时间复杂度：O(NlogN)，其中 N 为数组的长度,需要对数组进行排序。空间复杂度：O(N)，其中 N 为数组的长度。注意我们在这里应当考虑递归调用栈的深度。
        Arrays.sort(nums);
        for (int i =0;i< nums.length;i++)
        {
            if(nums[i]==nums[i+1])
                return false;
        }
        return true;
    }

    public static boolean containsDuplicate2(int[] nums)
    {
        //方法二：哈希表
        //对于数组中每个元素，我们将它插入到哈希表中。如果插入一个元素时发现该元素已经存在于哈希表中，则说明存在重复的元素。
        //时间复杂度：O(N)，其中 N 为数组的长度。空间复杂度：O(N)，其中 N 为数组的长度。

        Set<Integer> set = new HashSet<Integer>();
        for(int i =0;i< nums.length;i++)
        {
            if(!set.add(nums[i]))
                return true;
        }
        return false;
    }


}
