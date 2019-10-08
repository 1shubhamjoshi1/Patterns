package FactoryBasic;

class Points {
    double x;
    double y;

    private Points(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static class PointFactory {

        public static Points newPolarPoint(double rho, double theta) {
            return new Points(rho * Math.cos(theta),
                    rho * Math.sin(theta));
        }

        public static Points newCartesianPoint(double x, double y) {
            return new Points(x, y);
        }
    }

    @Override
    public String toString() {
        return this.x + " " + this.y;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(Points.PointFactory.newCartesianPoint(30, 30));
        System.out.println(Points.PointFactory.newPolarPoint(30, 30));
    }
}