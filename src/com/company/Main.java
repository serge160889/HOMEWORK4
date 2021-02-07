package com.company;

public class Main {

    public static void main(String[] args) {
	Rectangle s1=new Rectangle(30);
	Rectangle s2=new Rectangle(10,12);
	Rectangle s3=new Rectangle(20,30);
	double s4=s1.calculateArea();
        System.out.println("площадь квадрата="+s4+"мм2");
        double s5=s2.calculateArea();
        System.out.println("площадь прямоугольника 1="+s5+"мм2");
        double s6=s3.calculateArea();
        System.out.println("площадь прямоугольника 2="+s6+"мм2");
        s1.printArea();
        s2.printArea();
        s3.printArea();
        s1.printRectangleKind();
        s2.printRectangleKind();
        s3.printRectangleKind();
        boolean f1=s1.isTheSameRectangle(s2);
        boolean f2=s2.isTheSameRectangle(s3);
        boolean f3=s3.isTheSameRectangle(s1);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        s3.printRectanglesCount();
        s3.printClassName(true);
        s3.printClassName(false);
      




    }
}
