package es.upm.miw.apaw.pd.visitor.figure;

public class VisitorArea extends Visitor {

    public double visitCircle(Circle circulo) {
        return Math.PI * circulo.getRadius() * circulo.getRadius();
    }

    public double visitSquare(Square cuadrado) {
        return cuadrado.getSide() * cuadrado.getSide();
    }

    public double visitTriangle(Triangle triangulo) {
        return triangulo.getBase() * triangulo.getHeight() * 0.5;
    }
}
