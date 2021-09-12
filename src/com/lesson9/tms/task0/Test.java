package com.lesson9.tms.task0;

/**
 * Create class for test.
 */

public class Test extends Figure {
    public static void main(String[] args) {
        try {
            Triangle triangle1=new Triangle(1,4,3);
            int tr1= triangle1.perimeterFigure();
            Triangle triangle2=new Triangle(5,4,3);
            int tr2= triangle2.perimeterFigure();
            Rectangle rectangle1=new Rectangle(3,1);
            int rec1=  rectangle1.perimeterFigure();
            Rectangle rectangle2=new Rectangle(5,7);
            int rec2= rectangle2.perimeterFigure();
            Circle circle1=new Circle(4);
            int cir= circle1.perimeterFigure();
            Figure[] figures=new Figure[5];
            figures[0]=triangle1;
            figures[1]=triangle2;
            figures[2]=rectangle1;
            figures[3]=rectangle2;
            figures[4]=circle1;
            for (int i=0; i<5; i++){
                System.out.println(figures[i]);
            }
            System.out.println("Сумма периметра всех фигур массива - "+(tr1+tr2+rec1+rec2+cir));

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
