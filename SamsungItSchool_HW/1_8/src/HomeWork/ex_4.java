package HomeWork;

import java.util.Scanner;

public class ex_4 {
    public static void main(String args[]) {
        Scanner In = new Scanner(System.in);
        int n = In.nextInt();
        int a[] = new int[1000];
        a[0] = 4;
        for (int i = 1; i < n; i++) {
            a[i] = a[i - 1] + 3;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
