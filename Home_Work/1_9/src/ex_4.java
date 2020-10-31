import static java.lang.Math.floor;

import java.util.Scanner;

public class ex_4 {
    public static void GetBinaryNumOf(double x, int n){
        for(int i = 0; i < n; i++){
            x *= 2;
            System.out.print((int) floor(x));
            x-= floor(x);
        }
    }
    public static void main(String args[]){
        Scanner In = new Scanner(System.in);
        double x = In.nextDouble();
        int n = In.nextInt();
        GetBinaryNumOf(x, n);
    }
}
