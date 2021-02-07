package com.company;

public class Rectangle {
    double x;
    double y;
    private static int createdRectangles;
    private final static String RUSSIAN_CLASS_NAME = "Прямоугольник";
    private final static String ENGLISH_CLASS_NAME = "Rectangle";

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
        createdRectangles++;

    }

    public Rectangle(double a) {
        this.x = a;
        this.y = a;
        createdRectangles++;

    }


    double calculateArea() {
        double s;
        s = x * y;
        return s;
    }

    void printArea() {
        System.out.println("площадь=" + calculateArea() + "мм2");

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

    boolean isTheSameRectangle(Rectangle w) {
        if (this.x == w.x && this.y == w.y)
            return true;
        else return false;
    }

    static void printRectanglesCount() {
        System.out.println("Всего было создано " + createdRectangles + " прямоугольника");
    }

    static void printClassName(boolean printlnRussian) {
        if (printlnRussian) {
            System.out.println(RUSSIAN_CLASS_NAME);
        } else
        System.out.println(ENGLISH_CLASS_NAME);
    }
}








