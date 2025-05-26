import java.util.*;

public class LongestSubArraySumKPos {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 1, 1, 1, 3, 3};
        int k = 6;
        int res = subArray(arr, arr.length, k);
        System.out.println(res);
    }

    static int subArray(int[] arr, int n, int k) {
        int i = 0, j = 0;
        int max = 0;
        int sum = 0;

        while (j < n) {
            sum += arr[j];

            while (i <= j && sum > k) {
                sum -= arr[i];
                i++;
            }

            if (sum == k) {
                max = Math.max(max, j - i + 1);
            }

            j++;
        }

        return max;
    }
}
