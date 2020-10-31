import java.util.Scanner;

public class ex_1 {
    public static int GetSumOfNum(int x){
        return x % 10 + x / 10;
    }
    public static void Writeln(int x){
        System.out.println(x);
    }
    public static void main(String args[]){
        Scanner In = new Scanner(System.in);
        int x = In.nextInt();
        Writeln(GetSumOfNum(x));
    }
}