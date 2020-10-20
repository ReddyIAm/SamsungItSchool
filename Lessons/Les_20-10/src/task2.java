import java.util.Scanner;

public class task2 {
    public static void main(String args[]){
        Scanner In = new Scanner(System.in);
        int n = In.nextInt();
        int m = In.nextInt();
        int a[][] = new int [30][30];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = In.nextInt();
            }
        }
        int sum = 0, count = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                sum+= a[i][j];
                count++;
            }
        }
        double sr = sum / count;
        System.out.println(sr);
    }
}
