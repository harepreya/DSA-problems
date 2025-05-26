
import java.util.*;
public class ThreeSum {
    public static void main(String[] args) {
        int arr[] ={-1,-1,-1,-2,0,0,0,2,2,2};
        System.out.println(threeSum(arr));
    }

    static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            if(i !=0 && nums[i] == nums[i-1])
                continue;
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int s = nums[i]+nums[j]+nums[k];
                if(s<0)
                    j++;
                else if(s>0)
                    k--;
                else{
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                    res.add(temp);
                    j++;
                    k--;

                    while(j<k && nums[j] == nums[j-1])
                        j++;
                    while(j<k && nums[k] == nums[k+1])
                        k--;
                }
            }
        }
        return res;
    }
}
