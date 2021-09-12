package com.lesson9.tms.task0;

/**
 * A triangle class has been created that implements the input of parameters
 * and the calculation of the perimeter and area.
 */

public class Triangle extends Figure implements IFigure {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public void squareFigure() {
        int perimeter=a+b+c;
        double square=(Math.sqrt(perimeter*(perimeter-a)*(perimeter-b)*(perimeter-c)));
        System.out.println("The area of the triangle "+square);
    }

    @Override
    public int perimeterFigure() {
        int perimeter=a+b+c;
        System.out.println("The perimeter of the triangle "+perimeter);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
