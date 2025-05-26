import java.util.*;
public class NoOfIslands {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int m = inp.nextInt();
        char arr[][] = new char[n][m];
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                arr[i][j] = inp.next().charAt(0);
            }
        }
        int c=0;
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(Character.isUpperCase(arr[i][j])){
                    c++;
                    check(arr,i,j);
                }
            }
        }
        System.out.println(c);

    }
    public static void check(char arr[][], int i, int j){
        if(i < 0 || i >= arr.length || j < 0 || j >= arr.length || !Character.isUpperCase(arr[i][j]))
            return;
        arr[i][j] = Character.toLowerCase(arr[i][j]);
        check(arr, i+1,j);
        check(arr, i-1,j);
        check(arr, i, j-1);
        check(arr, i, j+1);
        check(arr, i+1,j+1);
        check(arr, i-1,j-1);
        check(arr, i-1,j+1);
        check(arr, i+1, j-1);

    }
}
