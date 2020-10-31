import java.util.Scanner;

public class ex_1 {
    public static void main(String args[]){
        Scanner In = new Scanner(System.in);
        int n = In.nextInt();
        while(n > 0){
            System.out.print(n % 2);
            n/= 2;
        }
    }
}
