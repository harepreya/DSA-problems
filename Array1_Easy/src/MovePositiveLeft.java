import java.util.Arrays;
public class MovePositiveLeft {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 0, 0, 4, -5, 6, -7, 0, -9, 10 };
        int j = 0;
        //int temp;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] >= 0)
                // positive number moves to left if you want it to move to right then chnage the sign arr[i] < 0
                //  arr[i]%2==0
                // same to move the zeros to right by giving the cond arr[i] ! = 0 if makes the non zero to move to left
             {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                   ++j;
                }
            }
        System.out.println(Arrays.toString(arr));
    }
}