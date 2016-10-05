package es.upm.miw.apaw.pd.visitor.figure;

public class VisitorNumberOfSides extends Visitor {

    private double sum = 0;

    public void visitCircle(Circle circulo) {
        sum += Double.POSITIVE_INFINITY;
    }

    public void visitSquare(Square cuadrado) {
        sum += 4;
    }

    public void visitTriangle(Triangle triangulo) {
        sum += 3;
    }

    @Override
    public double getSum() {
        return sum;
    }
}
