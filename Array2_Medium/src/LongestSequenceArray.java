import java.util.*;

public class LongestSequenceArray {
    public static void main(String[] args) {
        int[] arr= {100,1,2,1,2,101,100,102,3,4,1};

        System.out.println( longestConsecutive(arr));
    }
    static int longestConsecutive(int[] nums) {
        int l = 0;
        Set<Integer> set = new HashSet<>();

        for(int i =0;i<nums.length;i++)
            set.add(nums[i]);

        for(int a : set){
            if(!set.contains(a-1)){
                int c = 1;
                int x = a;
                while(set.contains(x+1)){
                    x++;
                    c++;
                }
                l= Math.max(l,c);
            }
        }
        return l;
    }

}
