import java.util.Arrays;
import java.util.Scanner;

public class ex_2 {
    public static void main(String args[]){
        Scanner In = new Scanner(System.in);
        int arr[] = new int[100000];
        int n = In.nextInt();
        for(int i = 0; i < n; i++) {
            arr[i] = In.nextInt();
        }
        //Сортируем массив
        Arrays.sort(arr);
        //Выводим отсортированный массив на консоль.
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
