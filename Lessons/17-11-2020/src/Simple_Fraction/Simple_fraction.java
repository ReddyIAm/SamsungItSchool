package Simple_Fraction;

import java.util.Scanner;

public class Simple_fraction {

    Scanner In = new Scanner(System.in);

    private int numerator, denominator;

    Simple_fraction(){
        numerator = 1;
        denominator = 1;
    }

    Simple_fraction(int denominator){
        numerator = 1;
        this.denominator = denominator;
    }

    Simple_fraction(int numerator, int denominator){
        if(denominator == 0){
            System.out.println("Знаменатель не может быть равен 0");
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public void setDenominator(int denominator){
        this.denominator = denominator;
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public void input(){
        System.out.println("Введите числитель:");
        numerator = In.nextInt();
        System.out.println("Введите знаменатель:");
        denominator = In.nextInt();
    }

    public void print(){
        if(this.denominator == 1){
            System.out.println(numerator);
        } else {
            System.out.println(numerator + "/" + denominator);
        }
    }

    public void print(String s){
        System.out.println(s + " " + numerator + "/" + denominator);
    }

    public void sum(Simple_fraction a){
        int lcm = gcd_and_lcm.lcm(denominator, a.denominator);
        numerator *= lcm / denominator;
        int a_num = a.numerator * (lcm / a.denominator);
        numerator += a_num;
        denominator = lcm;
    }

    public void sum(int a){
        Simple_fraction n = new Simple_fraction(a, 1);
        sum(n);
    }
    public void multiply(Simple_fraction a){
        this.numerator *= a.numerator;
        this.denominator *= a.denominator;
    }

    public void multiply(int a){
        this.numerator*= a;
    }

    public void reduce(){
        int gcd = gcd_and_lcm.gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }
}
