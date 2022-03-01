
package com.company;

class Q2Circle extends Q2Shape {

    public Q2Circle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    public double area() {
        double v = super.PI * super.dim1 * super.dim2;

        v= Math.round(v*10.0)/10.0;
        return v;
    }
}
