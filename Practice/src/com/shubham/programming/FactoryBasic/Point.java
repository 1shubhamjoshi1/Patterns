package FactoryBasic;

public class Point {
    double x;
    double y;

    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Point newPolarPoint(double rho, double theta) {
        return new Point(rho * Math.cos(theta),
                rho * Math.sin(theta));
    }

    public static Point newCartetianPoint(double x, double y) {
        return new Point(x, y);
    }

    @Override
    public String toString() {
        return this.x + " " + this.y;
    }
}