import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 6, 0}; // Assuming an extra slot for insertion
        int val = 3;
        int pos = 2;
        insert(arr, val, pos);
        System.out.println(Arrays.toString(arr));
    }

    public static void insert(int arr[], int val, int pos) {
        if (pos > arr.length || pos < 1) {
            System.out.println("Invalid position");
            return;
        }

        for (int i = arr.length - 1; i > pos - 1; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos - 1] = val;
    }
}
