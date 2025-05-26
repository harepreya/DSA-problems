import java.util.Arrays;

public class NextPermutations{
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void nextPermutation(int[] arr) {
        int n = arr.length;
        int ind = -1;
        for(int i = n - 2; i >= 0; i--) {
            if(arr[i] < arr[i + 1]) {
                ind = i;
                break;
            }
        }
        if(ind == -1) {
            reverse(arr, 0, n - 1);
            return;
        }
        for(int i = n - 1; i > ind; i--) {
            if(arr[i] > arr[ind]) {
                swap(arr, i, ind);
                break;
            }
        }
        reverse(arr, ind + 1, n - 1);
    }
    static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

