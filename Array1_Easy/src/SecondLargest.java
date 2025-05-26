public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={1,4,5,6,2,3};
        System.out.println(secondL(arr));
    }

    static int secondL(int[] arr){
        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i = 1;i<n;i++){
            if(arr[i] > largest){
                slargest = largest;
                largest =arr[i];
            }
            else if(arr[i] < largest && arr[i] > slargest){
                slargest = arr[i];
            }
        }
        return slargest;
    }
}

