import java.util.*;
public class SortArrayByFreq {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int arr[] = new int[n];
        int max =0,min =0;
        for(int i=0;i<n;i++){
            arr[i] = inp.nextInt();
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }
        int t = Math.abs(min);
        int freq[] = new int[max+1+t];
        for(int i : arr){
            freq[i+t]++;
        }
        while(true){
            int idx=-1;
            int maxEle = 0;
            for(int i =0;i<max+1+t;i++){
                if(maxEle < freq[i]){
                    idx = i;
                    maxEle = freq[i];
                }
            }
            if(idx == -1)
                break;
            for(int i= 0;i<freq[idx];i++){
                System.out.print(idx-t+" ");
            }
            freq[idx] = 0;
        }

    }
}
