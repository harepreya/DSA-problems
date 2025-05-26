import java.util.*;
public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int arr1[] ={1,2,2,3,3,4};
        int arr2[] ={2,3,4,4,5,6};
        union(arr1,arr2);
    }

    static void union(int[] arr1, int[] arr2){
        Set<Integer> set = new HashSet<>();
        for(int i =0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i = 0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        for(int i : set)
            System.out.print(i+" ");
    }
}
