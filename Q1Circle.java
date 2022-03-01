package com.company;

public class Q1Circle extends Q1GeometricObject{
    private double radius;
    final static double PI=3.1415;
    public Q1Circle(){

    }
    public Q1Circle(int i) {

        radius=i;
    }
    public Q1Circle(int i,String color, boolean filled) {
        super(color,filled);
        radius=i;
    }
    public double getRadius(){

        return radius;
    }
    public void setRadius(double radius) {

        this.radius = radius;
    }
    public double getArea(){
        double area;
        area=PI*this.radius*this.radius;
        return area;
    }
    public double getPerimeter(){
        double perimeter;
        perimeter=2*PI*this.radius;
        return perimeter;
    }
    public double getDiameter(){
        double diameter;
        diameter=2*this.radius;
        return diameter;
    }

}
