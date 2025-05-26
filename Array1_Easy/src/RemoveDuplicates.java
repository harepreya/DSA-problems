import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,4};
        System.out.println(remove(arr));
    }
    // 2-pointer approach optimal
     static int remove(int[] arr){
        int i =0;
        int n = arr.length;
        for(int j = 1;j<n;j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return (i+1);
     }



// brute approach
//    static int remove(int[] arr){
//        Set<Integer> set = new HashSet<>();
//        int n = arr.length;
//        for(int i =0;i<n;i++){
//            set.add(arr[i]);
//        }
//        return set.size();
//
//    }



}
