package Vector2D;

import java.util.Locale;

public class Vector2D {

    private double vx, vy;

    public static int count;


    public Vector2D(){
        vx = 1;
        vy = 1;
        count ++;
    }

    public Vector2D(double vx, double vy){
        this.vx = vx;
        this.vy = vy;
        count++;
    }

    public Vector2D(Vector2D Vector){
        this.vx = Vector.getVx();
        this.vy = Vector.getVy();
        count++;
    }

    public double getVx() {
        return vx;
    }

    public double getVy() {
        return vy;
    }

    public void setVx(double vx) {
        this.vx = vx;
    }

    public void setVy(double vy) {
        this.vy = vy;
    }

    public void print(){
        System.out.println("(" + String.format(Locale.US, "%.2f", vx) + ", " + String.format(Locale.US, "%.2f", vy) + ")");
    }

    public double length(){
        return Math.sqrt(vx * vx + vy * vy);
    }

    public void add(Vector2D v){
        this.vx += v.getVx();
        this.vy += v.getVy();
    }

    public void sub(Vector2D v){
        this.vx -= v.getVx();
        this.vy -= v.getVy();
    }

    public void scale(double scaleFactor){
        this.vx *= scaleFactor;
        this.vy *= scaleFactor;
    }

    public void normalized(){
        double InvLength = 1 / length();
        this.vy *= InvLength;
        this.vx *= InvLength;
    }

    public double dotProduct(Vector2D v){
        return this.vx * v.getVx() + this.vy * v.getVy();
    }
}
