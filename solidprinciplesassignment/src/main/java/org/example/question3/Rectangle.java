package org.example.question3;

public class Rectangle {

    protected double height;
    protected double width;

    public void setHeight(double h) {
        height = h;
    }

    public void setWidth(double w) {
        width = w;
    }

    public double getArea() {
        return height * width;
    }

}
