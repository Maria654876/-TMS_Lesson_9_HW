package com.lesson9.tms.task0;

/**
 * A rectangle class has been created that implements the input of parameters
 * and the calculation of the perimeter and area.
 */

public class Rectangle extends Figure implements IFigure {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {this.b = b; }

    @Override
    public void squareFigure() {
        int square=a*b;
        System.out.println("The area of the rectangle "+square);
    }

    @Override
    public int perimeterFigure() {
        int perimeter=2*(a+b);
        System.out.println("Rectangle perimeter "+perimeter);

        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
