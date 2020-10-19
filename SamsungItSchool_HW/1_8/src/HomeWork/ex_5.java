package HomeWork;

import java.util.Scanner;

public class ex_5 {
    public static void main(String args[]) {
        Scanner In = new Scanner(System.in);
        int a[] = new int[1000];
        int n = In.nextInt();
        for(int i = 0; i < n; i++) {
            a[i] = In.nextInt();
        }

        int temp;
        for(int i = 0; i < n / 2; i++){
            temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
        }
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
