package Simple_Fraction;

public class main {
    public static void main(String args[]){
        Simple_fraction a = new Simple_fraction();
        a.input();
        a.reduce();
        System.out.println("Результат сокращения: ");
        a.print();
    }
}
