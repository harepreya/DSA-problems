import java.util.*;
public class MagicSquare {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int arr[][] = new int[n][n];
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++) {
                arr[i][j] = inp.nextInt();
            }
        }
        if(isMagic(arr))
            System.out.println("yes");
        else
            System.out.println("no");
    }
    public static boolean isMagic(int arr[][]){
        int psum =0;
        int s=0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            s =0;
            for(int j =0;j<n;j++){
                s+=arr[i][j];
            }
            if(psum == 0)
                psum = s;
            if(psum != s){
                return false;
            }
        }
        return true;
    }
}
