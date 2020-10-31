import java.util.Scanner;

public class ex_3 {
    public static int GetSumOfNum(int x){
        return (x % 10) + (x / 10 % 10) + (x / 100);
    }
    public static void Writeln(int x){
        System.out.println(x);
    }
    public static int GetNumOfSum(int topSum){
        int x = 0;
        for(int num = 100; num < topSum; num++){
            if(GetSumOfNum(num) % 13 == 0){
                x++;
            }
        }
        return x;
    }
    public static void main(String args[]){
        Scanner In = new Scanner(System.in);
        int TopSum = In.nextInt();
        Writeln(GetNumOfSum(TopSum));
    }
}
