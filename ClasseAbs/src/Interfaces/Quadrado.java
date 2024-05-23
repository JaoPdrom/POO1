package Interfaces;

public class Quadrado implements FormaGeometrica{

    double area;

    public Quadrado(double area){
        this.area = area;
    }

    @Override
    public double area() {
        return area*area;
    }

    @Override
    public double perimetro() {
        return 4*area;
    }
}
