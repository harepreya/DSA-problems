public class LinearSearch {
    public static void main(String[] args) {
        int arr[] ={2,3,4,7,1};
        int target = 7;
        System.out.println(linear(arr,target));

    }
    static int linear(int arr[], int target){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target) {
               return 1;
            }
        }
        return -1;
    }
}
