package com.sf.gandalf.solidprinciples.oc;

public class OpenClosePrinciple {
    static double areaCalculator(Shape shape) {
        double area = shape.calculateArea();
        System.out.println("Area - :" + area);
        return area;
    }

    static void main(String[] args) {
        areaCalculator(new Rectangle(4, 5));
        areaCalculator(new Triangle(4, 5));
    }
}

interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    double width;
    double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        System.out.println("Calculating Rectangle Area.");
        return width * length;
    }
}

class Triangle implements Shape {

    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        System.out.println("Calculating Triangle Area.");
        return 0.5 * base * height;
    }

}