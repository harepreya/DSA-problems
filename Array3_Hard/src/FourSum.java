import java.util.*;

public class FourSum {
    public static void main(String[] args) {
      int arr[] = {1,3,-1,2,2,2,1,4,5,1,-2};
      int target = 8;
      System.out.println(fourSum(arr,target));
    }
    static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i =0;i<nums.length;i++){
            if(i>0 && nums[i] == nums[i-1])
                continue;
            for(int j = i+1;j<nums.length;j++){
                if(j > i+1 && nums[j] == nums[j-1])
                    continue;
                int k = j+1;
                int l = nums.length-1;
                while(k < l){
                    long sum = nums[i];
                    sum += nums[j]+nums[k];
                    sum+=nums[l];
                    if(sum == target){
                        List<Integer> ans = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        res.add(ans);
                        k++;
                        l--;
                        while(k < l && nums[k] == nums[k-1])
                            k++;
                        while( k < l && nums[l] == nums[l+1])
                            l--;
                    }
                    else if(sum < target)
                        k++;
                    else
                        l--;
                }
            }
        }
        return res;

    }

}
