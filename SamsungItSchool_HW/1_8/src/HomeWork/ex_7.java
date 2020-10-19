package HomeWork;

import java.util.Scanner;

public class ex_7 {
    public static void main(String args[]) {
        Scanner In = new Scanner(System.in);
        int n = In.nextInt();
        int a[] = new int[1000];
        for (int i = 0; i < n; i++) {
            a[i] = In.nextInt();
        }
        int neg[] = new int[1000];
        int pos[] = new int[1000];
        int k_neg = 0, k_pos = 0;
        for(int i = 0; i < n; i++){
            if(a[i] < 0){
                neg[k_neg] = a[i];
                k_neg++;
            }
        }
        for(int i = 0; i < n; i++){
            if(a[i] > 0){
                pos[k_pos] = a[i];
                k_pos++;
            }
        }
        for(int i = 0; i < k_neg; i++){
            a[i] = neg[i];
        }
        for(int i = k_neg; i < n; i++){
            a[i] = pos[i - k_neg];
        }
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}