import java.util.Scanner;

public class ex_6 {
    public static void permute(int[] a){
        int min = a[0];
        int num_min = 0;
        for(int i = 1; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
                num_min = i;
            }
        }
        for(int i = num_min; i > 0; i--){
            a[i] = a[i - 1];
        }
        a[0] = min;
    }
    public static void main(String args[]){
        Scanner In = new Scanner(System.in);
        int n = In.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i] = In.nextInt();
        }
        permute(a);
        for(int now : a){
            System.out.print(now + " ");
        }
    }
}
