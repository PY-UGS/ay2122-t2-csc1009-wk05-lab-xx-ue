package com.company;

class Q2Triangle extends Q2Shape {
    public Q2Triangle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    public double area() {
        return (0.5*super.dim1*super.dim2);
    }
}
