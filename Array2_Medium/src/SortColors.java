import java.util.Arrays;
public class SortColors {
    public static void main(String[] args) {
        int arr[] = { 1,2,0,0,1,2,0,1};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sortColors(int[] nums) {
        int l =0,m=0;
        int h= nums.length-1;
        while(m<=h){
            if(nums[m]==0){
                swap(nums,l,m);
                l++;
                m++;
            }
            else if(nums[m]==1){
                m++;
            }
            else{
                swap(nums,m,h);
                h--;
            }
        }
    }
    public static void swap(int nums[],int n1, int n2){
        int temp = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = temp;
    }
}
