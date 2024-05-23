package Interfaces;

public class Circulo implements FormaGeometrica{

    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return 3.14 * Math.pow(raio, 2);
    }

    @Override
    public double perimetro() {
        return 3.14 * 2 * raio;
    }
}
