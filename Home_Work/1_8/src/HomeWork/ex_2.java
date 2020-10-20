package HomeWork;

import java.util.Scanner;

public class ex_2 {
    public static void main(String args[]){
        Scanner In = new Scanner(System.in);
        int n = In.nextInt();
        int a[] = new int[1000];
        for(int i = 0; i < n; i++){
            a[i] = In.nextInt();
        }
        int sum = 0;
        boolean flag = false;
        for(int i = 0; i < n; i++){
            if(a[i] % 2 == 0){
                sum+= a[i];
                flag = true;
            }
        }
        if(!flag){
            System.out.println("NO");
        } else{
            System.out.println(sum);
        }
    }

}

