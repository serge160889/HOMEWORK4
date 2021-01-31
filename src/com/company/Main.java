package com.company;

public class Main {

    public static void main(String[] args) {
	Rectangle s2=new Rectangle(10,12);
	Rectangle s3=new Rectangle(30);
	double s1=s2.calculateArea();
        System.out.println(s1);
        double s4=s3.calculateArea();
        System.out.println(s4);
        s2.printArea();
        s3.printArea();


    }
}
