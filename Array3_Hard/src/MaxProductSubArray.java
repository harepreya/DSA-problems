public class MaxProductSubArray {
    public static void main(String[] args) {
        int arr[] ={-2,3,4,1,-3,5};
        System.out.println(maxProduct(arr));
    }
    static int maxProduct(int[] nums) {
        int pre =1, suf=1;
        int n =nums.length;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(pre==0) pre=1;
            if(suf ==0) suf =1;
            pre *= nums[i];
            suf *= nums[n-i-1];
            ans = Math.max(ans, Math.max(pre,suf));
        }
        return ans;
    }
}
