import java.util.*;
public class VariousPath {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int m = inp.nextInt();

        List<String> l1 = new ArrayList<>();
        generatePath(n,m,"",l1);
        System.out.println(l1);
    }
    public static void generatePath(int n, int m , String s, List<String> l1){
        if(m < 1|| n < 1)
          return;
        if(m == 1 && n == 1) {
            l1.add(s);
            return;
        }
        generatePath(n,m-1,s+"h",l1);
        generatePath(n-1,m,s+"v",l1);

    }
}
