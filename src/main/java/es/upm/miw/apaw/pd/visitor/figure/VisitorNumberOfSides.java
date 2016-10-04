package es.upm.miw.apaw.pd.visitor.figure;

public class VisitorNumberOfSides extends Visitor {

    public double visitCircle(Circle circulo) {
        return Double.POSITIVE_INFINITY;
    }

    public double visitSquare(Square cuadrado) {
        return 4;
    }

    public double visitTriangle(Triangle triangulo) {
        return 3;
    }
}
