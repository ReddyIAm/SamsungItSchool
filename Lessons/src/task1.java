import java.util.Scanner;

public class task1 {
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
        int max = a[0][0];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(a[i][j] > max){
                    max = a[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
