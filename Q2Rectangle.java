package com.company;

class Q2Rectangle extends Q2Shape {
    public Q2Rectangle(int dim1, int dim2) {

        super(dim1, dim2);
    }

    public double area() {
        return (super.dim1 * super.dim2);
    }
}


