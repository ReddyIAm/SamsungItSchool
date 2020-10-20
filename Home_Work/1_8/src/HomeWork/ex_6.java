package HomeWork;

import java.util.Scanner;

public class ex_6 {
    public static void main(String args[]) {
        Scanner In = new Scanner(System.in);
        int n = In.nextInt();
        int a[] = new int[1000];
        boolean flags[] = new boolean[1000];
        for (int i = 0; i < n; i++) {
            a[i] = In.nextInt();
        }
        int k = 0, max = 0, maxK = 0;
        for (int i = 0; i < n - 1; i++) {
            if(!flags[i]) {
                for (int j = i + 1; j < n; j++) {
                    if (a[i] == a[j]) {
                        k++;
                        flags[j] = true;
                    }
                }
                if(maxK < k){
                    maxK = k;
                    max = i;
                }
                k = 0;
            }
        }
        System.out.println(a[max]);
    }
}
