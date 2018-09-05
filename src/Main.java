import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
    }

    public static int[] twoSum(int[] nums, int target) {
        int right=nums.length-1;
        for(int left=0;true;)
        {
            if(nums[left]+nums[right]==target)
            {
                return new int[]{left,right};
            }
            else if(nums[left]+nums[right]>target)
            {
                right--;
            }
            else if(nums[left]+nums[right]<target)
            {
                left++;
            }
        }

    }

}
