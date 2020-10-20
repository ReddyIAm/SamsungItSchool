import java.util.Scanner;

public class task4 {
    public static void main(String args[]){
        Scanner In = new Scanner(System.in);
        int n = In.nextInt();
        int a[][] = new int [30][30];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = In.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
           if (a[i][i] < 0){
               a[i][i] = 0;
           }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}