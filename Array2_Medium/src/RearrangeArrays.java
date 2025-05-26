import java.util.Arrays;

public class RearrangeArrays {
    public static void main(String[] args) {
        int arr[] ={3,-1,2,-4,9,-2};
        int res[] = rearrangeArray(arr);
        System.out.println(Arrays.toString(res));
    }
    static int[] rearrangeArray(int[] nums) {
        int ans[] = new int[nums.length];
        int p=0,n=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                ans[n]=nums[i];
                n+=2;
            }
            else{
                ans[p]=nums[i];
                p+=2;
            }
        }
        return ans;
    }
}
