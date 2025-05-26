import java.util.*;
public class LeadersArray {
    public static void main(String[] args) {
        int arr[] = {10,22,12,4,2,6};
        int n = arr.length;
        System.out.println(leaders(n,arr));
    }
    static ArrayList<Integer> leaders(int n, int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[n - 1];
        ans.add(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= max) {
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
