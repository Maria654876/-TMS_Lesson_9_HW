package com.lesson9.tms.task0;

/**
 * A circle class has been created that implements the input of parameters
 * and the calculation of the perimeter and area.
 */

public class Circle extends Figure implements IFigure {
    int r;

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public void squareFigure() {
        double square= Math.PI*(Math.pow(r,2));
        System.out.println("The area of the circle "+square);
    }

    @Override
    public int perimeterFigure() {
        int perimeter= (int) (2*(Math.PI)*r);
        System.out.println("Circle perimeter "+perimeter);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
