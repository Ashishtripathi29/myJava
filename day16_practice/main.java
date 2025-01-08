package day16_practice;


class cylinder {
    private int radius;
    private int height;

    cylinder() {
    };

    cylinder(int h, int r) {
        this.radius = r;
        this.height = h;
    }

    public int getHeight() {
        return height;
    }

    public int getRadius() {
        return radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double surfaceAreaOfCylinder(int h, int r) {
        double result = (2 * 3.14 * r * h) + (2 * 3.14 * r * r);
        // return Double. parseDouble(String.format("%.2f", result));
        // return result;

        double roundOff = (double) Math.round(result * 100) / 100;
        return roundOff;
    }

    public double volumeAreaOfCylinder(int h, int r) {
        double v = Math.PI * r * r * h;
        // System.out.println(v);
        return Math.round(v * 100.0) / 100.0;
    }
}

public class main {
    public static void main(String[] args) {
        System.out.println("strarting from here");
        /*
         * create a class cylinder and use getter and setters to set its radius and
         * height
         * use ➊ to calculate surface and volume of the cylinder
         * Use a constructor and repeat ➊
         * Overload a constructor used to initialize a rectangle of length and breath 5
         * for using custom parameters
         * Repeat ➊ for a sphere
        
         */

        // problem 1
        cylinder mCylinder = new cylinder();
        mCylinder.setHeight(10);
        mCylinder.setRadius(7);

        int h = mCylinder.getHeight();
        int r = mCylinder.getRadius();
        System.out.println("height:" + h + "  radius:" + r);

        // problem 2
        System.out.println(mCylinder.surfaceAreaOfCylinder(10, 7));
        System.out.println(mCylinder.volumeAreaOfCylinder(5, 6));

        // problem 3
        cylinder myCylinder = new cylinder(10,11);
        System.out.println("height:"+myCylinder.getHeight()+"\nradius:"+myCylinder.getRadius());
    }
}
