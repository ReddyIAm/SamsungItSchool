package HomeWork;

import java.util.Scanner;

public class ex_3 {
    public static void main(String args[]) {
        Scanner In = new Scanner(System.in);
        int n = In.nextInt();
        int a[] = new int[1000];
        for (int i = 0; i < n; i++) {
            a[i] = In.nextInt();
        }
        int sum = 0, k = 0;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if ((a[i] % 2) * (a[i] % 2) == 1) {
                sum += a[i];
                k++;
                flag = true;
            }
        }
        double sr = (double) sum / k;
        if (!flag) {
            System.out.println("NO");
        } else {
            System.out.printf("%.2f", sr);
        }
    }
}
