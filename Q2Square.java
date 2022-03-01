package com.company;

public class Q2Square extends Q2Shape {

    public Q2Square(int dim1, int dim2) {

        super(dim1, dim2);
    }

    public double area() {
        return (super.dim1 * super.dim2);
    }
}