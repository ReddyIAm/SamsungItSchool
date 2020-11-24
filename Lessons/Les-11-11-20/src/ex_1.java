import java.util.Scanner;

public class ex_1 {
    int x;
    int y;
    public void input(){
        Scanner In = new Scanner(System.in);
        System.out.println("Введите координату x");
        x = In.nextInt();
        System.out.println("Введите координату y");
        y = In.nextInt();
    }
    public void info(){
        System.out.println(x + ";" + y);
    }
    public void move(int dx, int dy){
        x+=dx;
        y+=dy;
    }
}
