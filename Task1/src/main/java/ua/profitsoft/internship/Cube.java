package ua.profitsoft.internship;

public class Cube implements Shape{
    private double lengthEdgeOfCube;

    public Cube(double lengthEdgeOfCube) {
        if (lengthEdgeOfCube >= 0){
            this.lengthEdgeOfCube = lengthEdgeOfCube;
        }else {
            throw new IllegalArgumentException();
        }
    }

    public double getLengthEdgeOfCube() {
        return lengthEdgeOfCube;
    }

    public void setLengthEdgeOfCube(double lengthEdgeOfCube) {
        if (lengthEdgeOfCube >= 0) {
            this.lengthEdgeOfCube = lengthEdgeOfCube;
        }else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public double area() {
        return lengthEdgeOfCube*lengthEdgeOfCube*lengthEdgeOfCube;
    }
}
