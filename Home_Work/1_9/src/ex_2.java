import java.util.Scanner;

public class ex_2 {
    public static void Writeln(int x) {
        System.out.println(x);
    }
        public static void GetSumOfNum(){
        int sum = 0;
        for(int i = 10; i < 100; i++){
            if(i % 7 == 0){
                sum+= i % 10 + i / 10;
            }
        }
        Writeln(sum);
    }
    public static void main(String args[]){
        Scanner In = new Scanner(System.in);
        int sum = 0;
        GetSumOfNum();
    }
}
