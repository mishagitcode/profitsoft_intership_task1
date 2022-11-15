package ua.profitsoft.internship;

import static java.lang.Math.PI;

public class Cylinder implements Shape{
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        if (radius >= 0 && height >=0) {
            this.radius = radius;
            this.height = height;
        }else {
            throw new IllegalArgumentException();
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius >= 0) {
            this.radius = radius;
        }else {
            throw new IllegalArgumentException();
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height >= 0) {
            this.height = height;
        }else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public double volume() {
        return PI*height*radius*radius;
    }
}
