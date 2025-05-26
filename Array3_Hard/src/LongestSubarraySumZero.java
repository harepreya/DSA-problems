import java.util.*;
public class LongestSubarraySumZero {
    public static void main(String[] args) {
        int arr[] = {1, -1, 2, -8, 1, 7, -2, 3};
        System.out.println(maxLen(arr, arr.length));
    }

    static int maxLen(int arr[], int n) {
        int max = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0) {
                max = i + 1;
            } else {
                if (map.get(sum) != null) {
                    max = Math.max(max, i - map.get(sum));
                } else {
                    map.put(sum, i);
                }
            }
        }
        return max;
    }
}
