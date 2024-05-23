package Interfaces;

public class Triangulo implements FormaGeometrica{

    double a;
    double b;
    double c;
    double h;

    public Triangulo(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double area() {
        return (a*h)/2;
    }

    @Override
    public double perimetro() {
        return a+b+c;
    }
}
