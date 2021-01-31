package com.company;

public class Rectangle {
    double x;
    double y;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Rectangle(double a) {
        this.x = a;
        this.y = a;

    }

    double calculateArea() {
        double s;
        s = x * y;
        return s;
    }

    void printArea() {
        System.out.println("площадь="+calculateArea()+"мм2");

    }

    void printRectangleKind() {
        if (x != y) {
            System.out.println("Это прямоугольник");
        } else if (x == y) {
            System.out.println("Это квадрат");
        } else if (x == 0 | y == 0) {
            System.out.println("Нет фигуры");

        }
    }
    boolean isTheSameRectangle(Rectangle w){
        if(this.x==w.x&&this.y==w.y)
            return true;
            else  return false;
    }



    }



