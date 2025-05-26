import java.util.*;
public class CountSubarrayWithXorK {
    public static void main(String[] args) {
      int arr[] = {4,2,2,6,4,8};
      int k =6;
      System.out.println(solve(arr,k));
    }
    static int solve(int[] a, int k) {
        int n = a.length;
        int xr = 0;
        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(xr, 1);
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            xr = xr ^ a[i];
            int x = xr ^ k;
            if (mpp.containsKey(x)) {
                cnt += mpp.get(x);
            }
            if (mpp.containsKey(xr)) {
                mpp.put(xr, mpp.get(xr) + 1);
            } else {
                mpp.put(xr, 1);
            }
        }
        return cnt;
    }
}

