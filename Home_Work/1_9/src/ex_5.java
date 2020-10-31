import java.text.DecimalFormat;
import java.util.Scanner;

public class ex_5 {
    public static void GetAverage(int[] a, int n){
        DecimalFormat dF = new DecimalFormat("#.00");
        double sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++){
            if(a[i] >= 1000 && a[i] < 10000){
                sum+= a[i];
                count++;
            }
        }
        if(count == 0){
            System.out.println(dF.format(-1));
        } else {
            double average = sum / count;
            System.out.print(dF.format(average));
        }
    }
    public static void main(String args[]){
        Scanner In = new Scanner(System.in);
        int n = In.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i] = In.nextInt();
        }
        GetAverage(a, n);
    }
}