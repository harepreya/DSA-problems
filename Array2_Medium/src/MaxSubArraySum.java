import java.util.*;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int arr[] = {1,-1,-4,4,-2,4,-1,3};
        System.out.println(maxSubArray(arr));
    }
    static int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = nums[0];
        for(int i =0;i<nums.length;i++){
            sum += nums[i];
            if(sum>maxi) {
                maxi = sum;
            }
            if(sum < 0){
                sum =0;
            }
        }

        return maxi;
    }
}
