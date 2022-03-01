package com.company;

public class Q2Main {

    public static void main(String[] args) {
	Q2Rectangle r =new Q2Rectangle(9,5);
    Q2Triangle t= new Q2Triangle(10,8);
    Q2Circle c =new Q2Circle(5,5);
    Q2Ellipse e=new Q2Ellipse(7,7);
    Q2Square s=new Q2Square (6,6);
    Q2Shape figref;
    figref=r;
    System.out.println("Inside Area for Rectangle. ");
    System.out.println("Area is "+figref.area());

    figref=t;
    System.out.println("Inside Area for Triangle. ");
    System.out.println("Area is "+figref.area());
    figref=c;
    System.out.println("Inside Area for Circle. ");
    System.out.println("Area is "+figref.area());
    figref=e;
    System.out.println("Inside Area for Ellispe. ");
    System.out.println("Area is "+figref.area());
    figref=s;
    System.out.println("Inside Area for Square. ");
    System.out.println("Area is "+figref.area());
    }
}
