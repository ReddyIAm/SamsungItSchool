import java.util.Scanner;

public class task3 {
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
        int c = 0, nc = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(a[i][j] % 2 == 1){
                    nc++;
                } else{
                    c++;
                }
            }
        }
        if(c > nc){
            System.out.println("Количество чётных элементов превышает количество нечётных");
            System.out.println("Нечётных: " + nc);
            System.out.println("Чётных: " + c);
        } else if(c < nc){
            System.out.println("Количество нечётных элементов превышает количество чётных");
            System.out.println("Нечётных: " + nc);
            System.out.println("Чётных: " + c);
        } else {
            System.out.println("Количество нечётных элементов равно количеству чётных");
            System.out.println("Нечётных: " + nc);
            System.out.println("Чётных: " + c);
        }
    }
}