import java.util.HashMap;
import java.util.Map;

public class TwoNumbersAdd1 {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            for (int j=i+1;j<nums.length;j++)
                if(target==(nums[i]+nums[j]))
                    return (new int[]{i,j});
        }
        throw new IllegalArgumentException("No two sum solution");
    }




   //一遍hash
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            if (map.containsKey(complement)) {
//                return new int[] { map.get(complement), i };
//            }
//            map.put(nums[i], i);
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }
}
