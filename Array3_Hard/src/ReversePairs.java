import java.util.*;

public class ReversePairs {
    public static void main(String[] args) {
        int arr[] ={40,12,4,2,8,5};
        System.out.println(reversePairs(arr));
    }
    static int reversePairs(int[] nums) {
        int n = nums.length;
        return mergeSort(nums,0,n-1);
    }

    static int mergeSort(int[] nums, int low, int high){
        int cnt =0;
        if(low>=high) return cnt;
        int mid = (low+high)/2;
        cnt+= mergeSort(nums,low,mid);
        cnt+= mergeSort(nums,mid+1,high);
        cnt+= count(nums,low,mid,high);
        merge(nums,low,mid,high);
        return cnt;
    }

    static void merge(int nums[], int low, int mid, int high){
        ArrayList<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid+1;
        int cnt=0;
        while(left<=mid && right<=high){
            if(nums[left] <= nums[right]){
                list.add(nums[left]);
                left++;
            }
            else{
                list.add(nums[right]);
                right++;
            }
        }
        while(left<=mid){
            list.add(nums[left]);
            left++;
        }
        while(right<=high){
            list.add(nums[right]);
            right++;
        }
        for(int i =low;i<=high;i++){
            nums[i]= list.get(i-low);
        }
    }

    static int count(int[] nums, int low, int mid, int high){
        int right = mid+1;
        int cnt =0;
        for(int i =low;i<=mid;i++){
            while(right<=high && (long)nums[i] > 2L * (long)nums[right]){
                right++;
            }
            cnt+=(right-(mid+1));

        }
        return cnt;
    }
}
