import java.util.*;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for(int i = (int)Math.pow(10,n-1); i<(int)Math.pow(10,n);i++){
            if(check(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean check(int i){
        int n = i;
        int s =0;
        while(n>0){
            int r = n%10;
            if(r == 6)
                s = s*10+9;
            else if(r == 9)
                s = s*10+6;
            else if(r==0 || r ==1 || r==8)
                s = s*10+r;
            else
                return false;
            n/=10;
        }
        return i == s;
    }
}
