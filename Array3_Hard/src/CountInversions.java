import java.util.*;
public class CountInversions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        System.out.println(inversionCount(arr, n));
    }
    static long inversionCount(long arr[], int n) {
        return mergeSort(arr, 0, n - 1);
    }

    static long mergeSort(long[] arr, int low, int high) {
        long cnt = 0;
        if (low < high) {
            int mid = low + (high - low) / 2;
            cnt += mergeSort(arr, low, mid);
            cnt += mergeSort(arr, mid + 1, high);
            cnt += merge(arr, low, mid, high);
        }
        return cnt;
    }

    static long merge(long[] arr, int low, int mid, int high) {
        ArrayList<Long> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        long cnt = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                cnt += (mid - left + 1);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++)
            arr[i] = temp.get(i - low);
        return cnt;
    }
}
