import java.util.ArrayList;

public class IntersectionOfSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {2,3,5,6,7,7,9};
        int arr2[] = {1,2,3,5,7,7};
        intersection(arr1,arr2);

    }
    static void intersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                list.add(arr1[i]);
                i++;
                j++;
            }
        }

        for(int a : list){
            System.out.print(a+" ");
        }
    }
}
