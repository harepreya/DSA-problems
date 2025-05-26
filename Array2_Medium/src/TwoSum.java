import java.util.*;

public class TwoSum{
   static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int num = nums[i];
            int rem = target-num;
            if(map.containsKey(rem)){
                return new int[]{map.get(rem), i};
            }
            map.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }

        public static void main(String args[]) {
            int n = 5;
            int[] arr = {2, 6, 5, 8, 11};
            int target = 14;
            int[] ans = twoSum(arr, target);
            System.out.println( Arrays.toString(ans));
        }

}