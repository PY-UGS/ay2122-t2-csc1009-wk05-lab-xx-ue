package com.company;

abstract class Q2Shape {
    int dim1;
    int dim2;
    double PI;
    public Q2Shape(int dim1, int dim2){
         this.dim1=dim1;
         this.dim2=dim2;
         this.PI=3.14159;


    }

    public abstract double area();
}
