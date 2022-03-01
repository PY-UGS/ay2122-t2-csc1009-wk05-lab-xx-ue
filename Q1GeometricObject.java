package com.company;

public class Q1GeometricObject {
    private String color = "white";
    private boolean filled = false;
    private java.util.Date dateCreated;

    public Q1GeometricObject(){}
    public Q1GeometricObject(String color, boolean filled) {
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public java.util.Date getDate() {
        java.util.Date dateCreated= new java.util.Date();
        return dateCreated;
    }
    public String toString() {
        return ("created on "+ this.getDate() + " \ncolor: " + this.getColor() + " and filled: " + this.isFilled());
    }
}