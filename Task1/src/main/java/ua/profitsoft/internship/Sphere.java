package ua.profitsoft.internship;

import static java.lang.Math.PI;

public class Sphere implements Shape{
    private double radius;

    public Sphere(double radius) {
        if (radius >= 0) {
            this.radius = radius;
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

    @Override
    public double volume() {
        return (4* PI *radius*radius*radius)/3;
    }
}
