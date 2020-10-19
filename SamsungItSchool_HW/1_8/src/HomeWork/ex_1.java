package HomeWork;

import java.util.Scanner;

public class ex_1 {
    public static void main(String args[]){
        Scanner In = new Scanner(System.in);
        int n = In.nextInt();
        int a[] = new int[1000];
        for(int i = 0; i < n; i++){
            a[i] = In.nextInt();
        }
        int x = In.nextInt();
        boolean flag = false;
        for(int i = 0; i < n; i++){
            if(x == a[i]){
                System.out.println(i + 1);
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("NO");
        }
    }

}
