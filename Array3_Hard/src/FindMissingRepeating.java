public class FindMissingRepeating {
    public static void main(String[] args) {
        int arr[] ={1,1,2,4,5};
        System.out.println(findTwoElement(arr,arr.length));
    }
    static int[] findTwoElement(int arr[], int n) {
        long sum = (n*(n+1))/2;
        long sqr = (n * (n+1) * (2*n+1))/6;
        long s=0,sq=0;
        for(int i =0;i<n;i++){
            s+=arr[i];
            sq+= (long)arr[i] * (long)arr[i];
        }

        long val1 = s-sum;
        long val2 = sq-sqr;
        val2 = val2/val1;
        long x = (val1 + val2)/2;
        long y = x - val1;
        int ans[] ={(int)x,(int)y};
        return ans;
    }
}
