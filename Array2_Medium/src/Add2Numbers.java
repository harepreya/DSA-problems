import java.util.*;
public class Add2Numbers {
    public static void main(String[] args) {
        Scanner inp =  new Scanner(System.in);
        int n1 = inp.nextInt();
        int arr1[] = new int[n1];
        for(int i =0;i<n1;i++){
            arr1[i] = inp.nextInt();
        }
        int n2 = inp.nextInt();
        int arr2[] = new int[n2];
        for(int i =0;i<n2;i++){
            arr2[i] = inp.nextInt();
        }
        int l1 = n1-1;
        int l2 = n2-1;
        int size = n1>n2 ? n1+1 : n2+1;
        int carry = 0;
        int res[] = new int[size];
        int i = size-1;
        while(l1 >= 0 && l2 >= 0){
            int s = arr1[l1--] + arr2[l2--] + carry;
            carry = s/10;
            res[i--] = s%10;
        }
        while(l1 >=0){
            int s = arr1[l1--] + carry;
            carry = s/10;
            res[i--] = s%10;
        }
        while(l2 >=0){
            int s = arr2[l2--] + carry;
            carry = s/10;
            res[i--] = s%10;
        }
        if(carry > 0){
            res[i] = carry;
        }
        int start = res[0]==0 ? 1 : 0;
        for(int j =start;j<size;j++){
                System.out.println(res[j]+" ");
            }
        }
    }

