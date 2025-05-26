public class DeleteElement {
    public static void main(String[] args) {
        int arr[] = { 2,4,6,8,10};
        int del = 8;
        print(arr,del);
    }
    public static void print(int arr[],int d){
        boolean val = false;
        for(int i =0;i<arr.length;i++){
            if(d == arr[i]){
                for(int j =i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                val = true;
                arr[arr.length-1] =0;
                break;
            }
        }
        if(val){
            for(int i =0;i<arr.length-1;i++){
                System.out.print(arr[i]+" ");
            }
        }
        else{
            System.out.println("Invalid");
        }
    }
}
