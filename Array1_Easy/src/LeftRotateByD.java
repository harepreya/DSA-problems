import java.util.Arrays;

public class LeftRotateByD {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 1,2,3,4,5};
        int d = 3;
        rotate(arr,n,d);
       System.out.println(Arrays.toString(arr));
    }

    static void rotate(int arr[], int n, int d) {

        if (n == 0) return;

        d = d % n;

        rev(arr, 0, d - 1);

        rev(arr, d, n - 1);

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

