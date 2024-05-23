package Interfaces;

public class Main {
    public static void main(String[] args) {
        FormaGeometrica forma1 = new Circulo(5);
        System.out.println("Area do circulo: " + forma1.area());
        System.out.println("Perimetro do circulo: " + forma1.perimetro());

        FormaGeometrica forma2 = new Quadrado(5);
        System.out.println("Area do quadrado: " + forma2.area());
        System.out.println("Perimetro do quadrado: " + forma2.perimetro());

        FormaGeometrica forma3 = new Triangulo(2, 2,2,2);
        System.out.println("Area do triangulo: " + forma3.area());
        System.out.println("Perimetro do triangulo: " + forma3.perimetro());
    }
}
