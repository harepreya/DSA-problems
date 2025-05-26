public class Triplets {
    public static void main(String[] args) {
        int arr[] = {2,1,5,0,4,6};
        // i<j<k any one triplet should be valid
        // example [arr[3]<arr[4]<arr[5]   0 < 4 < 6
        System.out.println(check(arr));
    }
    public static boolean check(int[] arr){
        int f = Integer.MAX_VALUE;
        int s = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            if(f>=arr[i]){
                f = arr[i];
            }
            else if(s>=arr[i]){
                s=arr[i];
            }
            else{
                return true;
            }
        }
        return false;
    }
}
