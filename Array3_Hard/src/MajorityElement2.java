import java.util.*;
public class MajorityElement2 {
    public static void main(String[] args) {
        int arr[]= {1,1,2,1,3,2,4,2};
        System.out.println(majorityElement(arr));
    }
    static List<Integer> majorityElement(int[] nums) {
        int c1 =0,c2=0;
        int ele1 = -1, ele2=-1;
        int n = nums.length;
        for(int i =0;i<nums.length;i++){
            if(c1==0 && nums[i] != ele2){
                c1=1;
                ele1=nums[i];
            }
            else if (c2==0 && nums[i] != ele1){
                c2=1;
                ele2= nums[i];
            }
            else if(ele1 ==nums[i])
                c1++;
            else if(ele2==nums[i])
                c2++;
            else{
                c1--;
                c2--;
            }
        }
        List<Integer> ans = new ArrayList<>();
        int ct1=0, ct2=0;
        for(int i : nums){
            if(ele1 == i){
                ct1++;
            }
            if(ele2 == i){
                ct2++;
            }
        }
        int res = (int)n/3 + 1;
        if(ct1 >= res){
            ans.add(ele1);
        }
        if(ct2 >= res && ele1 != ele2){
            ans.add(ele2);
        }
        return ans;
    }
}
