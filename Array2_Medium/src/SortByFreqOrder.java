import java.util.*;
public class SortByFreqOrder {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int arr[] = new int[n];
        int max=0;
        for(int i =0;i<n;i++){
            arr[i] = inp.nextInt();
            max = Math.max(max,arr[i]);
        }
        int freq[] = new int[max+1];
        for(int num : arr){
            freq[num]++;
        }
        while(true){
            int idx = -1;
            int maxEle =0;
            for(int i=0;i<n;i++){
                if(maxEle < freq[arr[i]]){
                idx = arr[i];
                maxEle = freq[arr[i]];
                }
            }
            if(idx == -1)
                break;
            for(int i =0;i<freq[idx];i++){
                System.out.print(idx+" ");
            }
            freq[idx] =0;
        }
    }
}
