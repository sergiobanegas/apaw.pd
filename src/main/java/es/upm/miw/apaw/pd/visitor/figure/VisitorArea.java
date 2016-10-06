package es.upm.miw.apaw.pd.visitor.figure;

public class VisitorArea implements Visitor {

    private double sum = 0;

    @Override
    public void visitCircle(Circle circulo) {
        sum += Math.PI * circulo.getRadius() * circulo.getRadius();
    }

    @Override
    public void visitSquare(Square cuadrado) {
        sum += cuadrado.getSide() * cuadrado.getSide();
    }

    @Override
    public void visitTriangle(Triangle triangulo) {
        sum += triangulo.getBase() * triangulo.getHeight() * 0.5;
    }

    @Override
    public double getSum() {
        return sum;
    }
}
