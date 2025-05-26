//optimal

public class MissingNumber {
    public static void main(String[] args) {
        int arr[]  = { 1,3,4,5};
        int N = 5;
        find(arr,N);
    }

    static void find(int[] arr, int N){
        int xor1 = 0;
        int xor2 = 0;
        for(int i =0;i<N-1;i++){
            xor2 ^= arr[i];
            xor1 ^=(i+1);
        }
        xor1 ^= N;
        System.out.println(xor1^xor2);
    }
}
