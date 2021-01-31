package com.company;

public class Rectangle {
    double x;
    double y;

    public Rectangle(double x, double y){
        this.x=x;
        this.y=y;
    }
    public Rectangle(double a){
        this.x=a;
        this.y=a;

    }

     double calculateArea(){
        double s;
        s=x*y;
      return s;
    }
    void printArea(){
        System.out.println(calculateArea());

    }
}
