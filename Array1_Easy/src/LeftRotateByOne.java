import java.util.Arrays;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int arr[]= { 1,2,3,4,5,6,7};
        rotate(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int[] arr, int n){
        int temp = arr[0];
        for(int i = 1; i< n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
}
