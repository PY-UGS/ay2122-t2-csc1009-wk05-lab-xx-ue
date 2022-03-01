package com.company;

public class Q1Rectangle extends Q1GeometricObject{
    private double width;
    private double height;
    public Q1Rectangle() {}
    public Q1Rectangle(int i, int j) {
        width=i;
        height=j;
    }
    public Q1Rectangle(int i, int j,String color,boolean filled) {
        super(color,filled);
        width=i;
        height=j;

    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width =width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        double area;
        area=this.height*this.width;
        return area;}
    public double getPerimeter(){
        double perimeter;
        perimeter=2*(this.height+this.width);
        return perimeter;
    }
}

