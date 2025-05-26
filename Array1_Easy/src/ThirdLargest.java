public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr={1,4,5,6,2,3};
        System.out.println(thirdL(arr));
    }
static int thirdL(int[] arr){
    int largest = arr[0];
    int slargest = Integer.MIN_VALUE;
    int tlargest = Integer.MIN_VALUE;

    int n = arr.length;
    for(int i = 1;i<n;i++){
        if(arr[i] > largest){
            tlargest= slargest;
            slargest = largest;
            largest =arr[i];
        }
        else if(arr[i] < largest && arr[i] > slargest){
            tlargest = slargest;
            slargest = arr[i];
        }
        else if(arr[i] < slargest && arr[i ] > tlargest){
            tlargest=arr[i];
        }
    }
    return tlargest;
}
}
