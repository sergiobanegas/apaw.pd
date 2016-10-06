package es.upm.miw.apaw.pd.visitor.figure;

public class VisitorNumberOfSides implements Visitor {

    private double sum = 0;

    @Override
    public void visitCircle(Circle circulo) {
        sum += Double.POSITIVE_INFINITY;
    }

    @Override
    public void visitSquare(Square cuadrado) {
        sum += 4;
    }

    @Override
    public void visitTriangle(Triangle triangulo) {
        sum += 3;
    }

    @Override
    public double getSum() {
        return sum;
    }
}
