import java.util.*;
public class RightRotateByD {
    public static void main(String[] args) {
        int[]  arr = {1,2,3,4,5,6};
        int d = 2;
        int n = arr.length;
        rotate(arr,n,d);
        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int arr[], int n, int d) {

        if (n == 0) return;

        d = d % n;

        rev(arr, n-d, n - 1);

        rev(arr, 0, n -d- 1);

        rev(arr, 0, n - 1);
    }
    static void rev(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
