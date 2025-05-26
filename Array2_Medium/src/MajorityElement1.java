public class MajorityElement1 {
    public static void main(String[] args) {
        int arr[] ={7,5,7,5,7,5,5,5,5,3};
        int res = majorityElement(arr);
        System.out.println(res);
    }
    static int majorityElement(int[] nums) {
        int c = 0;
        int ele =0;
        for(int i =0;i<nums.length;i++){
            if(c == 0){
                c=1;
                ele = nums[i];
            }
            else if(nums[i] == ele)
                c++;
            else
                c--;
        }
        int c1=0;
        for(int i : nums){
            if(i == ele)
                c1++;
        }
        if(c1 > nums.length/2)
            return ele;
        return -1;
    }
}
