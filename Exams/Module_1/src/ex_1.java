import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args){
        Scanner In = new Scanner(System.in);
        int n = In.nextInt();
        int [] a = new int [10000];
        for(int i = 0; i < n; i++){
            a[i] = In.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Boolean flag = false;
        for(int i = 0; i < n; i++){
            if(a[i] % 2 == 0 && a[i] > 0){
                flag = true;
                if(a[i] <= min){
                    min = a[i];
                }
                if(a[i] >= max){
                    max = a[i];
                }
            }
        }
        if(flag){
            System.out.print(min + " " + max);
        } else {
            System.out.print(-1 + " " + -1);

        }
    }
}
