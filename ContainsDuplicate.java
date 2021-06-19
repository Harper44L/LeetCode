

//解法一： 暴力求解会导致超时！！！！！！！
//public class ContainsDuplicate {
//    public boolean containsDuplicate(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if(nums[i]==nums[j])
//                    return true;
//            }
//        }
//        return false;
//    }
//
//}

// 解法二：运用排序！
//import java.util.Arrays;
//
//public class ContainsDuplicate {
//    public boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length-1; i++) {
//            if(nums[i]==nums[i+1]){
//                return true;
//            }
//        }
//        return false;
//    }
//}

//解法三：

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>(); //Set是不可重复的！！！！敲重点！！！
        for (int x : nums){
            if(!set.add(x))
                return true;
        }
        return false;

    }
}
