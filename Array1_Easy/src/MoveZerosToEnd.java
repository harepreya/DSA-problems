import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
          int arr[] = {1,2,0,3,0,4,0,5,0,9};
          int j = -1;
          for(int i =0;i<arr.length;i++){
              if(arr[i]==0){
                  j=i;
                  break;
              }
          }

          for(int i = j+1;i<arr.length;i++) {
              if (arr[i] != 0) {
                  swap(arr, i, j);
                  j++;
              }
          }
          System.out.println(Arrays.toString(arr));
    }

    static void swap(int arr[], int num1, int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}
