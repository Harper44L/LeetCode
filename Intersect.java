import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Arrays;

public class Intersect {

    //方法一：哈希表：首先遍历第一个数组，并在哈希表中记录第一个数组中的每个数字以及对应出现的次数，
    // 然后遍历第二个数组，对于第二个数组中的每个数字，如果在哈希表中存在这个数字，则将该数字添加到答案，并减少哈希表中该数字出现的次数。
    //为了降低空间复杂度，首先遍历较短的数组并在哈希表中记录每个数字以及对应出现的次数，然后遍历较长的数组得到交集。

    public int[] intersect1(int nums1[],int nums2[]){
        if(nums1.length>nums2.length)
        {
            return intersect1(nums2, nums1); //选取最短的数组
        }

        Map<Integer, Integer> map= new HashMap<Integer, Integer>();
        for(int num : nums1)
        {
            int count = map.getOrDefault(num,0)+1; //get num的次数 默认是0
            map.put(num,count);
        }
        int[] intersection= new int[nums1.length];
        int index=0;
        for(int num:nums2)
        {
            int count =map.getOrDefault(num,0);
            if (count>0)
            {
                intersection[index++]=num;
                count--;
                if(count>0)
                {
                    map.put(num,count);
                }
                else
                {
                    map.remove(num);
                }
            }
        }

        return Arrays.copyOfRange(intersection,0,index) ;
        }
//时间复杂度：O(m+n)，其中m 和n 分别是两个数组的长度。需要遍历两个数组并对哈希表进行操作，
// 哈希表操作的时间复杂度是O(1)，因此总时间复杂度与两个数组的长度和呈线性关系。
//空间复杂度：O(min(m,n))，其中m 和n 分别是两个数组的长度。对较短的数组进行哈希表的操作，哈希表的大小不会超过较短的数组的长度。
// 为返回值创建一个数组 intersection，其长度为较短的数组的长度。




    //方法二：排序 + 双指针
    //首先对两个数组进行排序，然后使用两个指针遍历两个数组。
    public int[] intersect2(int[] nums1,int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int intersection[]=new int[Math.min(nums1.length,nums2.length)];
        int index1=0, index2=0,index=0;
        while(index1<nums1.length && index2<nums2.length)
        {
            if(nums1[index1]<nums2[index2])
                {index1++;}
            else if(nums1[index1]>nums2[index2])
                 {index2++;}
            else
                {
                intersection[index]=nums1[index1];
                index1++;
                index2++;
                index++;
                }
        }

        return Arrays.copyOfRange(intersection, 0, index);

    }

    //时间复杂度：O(mlogm+nlogn),其中m and n 分别是两个数组的长度。对两个数组进行排序的时间复杂度是 O(mlogm+nlogn),
    // 遍历两个数组的时间复杂度是O(m+n),故总时间复杂度是O(mlogm+nlogn)。
    //空间复杂度：O(min(m,n)),其中m 和n 分别是两个数组的长度

}
