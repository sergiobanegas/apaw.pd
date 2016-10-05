package es.upm.miw.apaw.pd.visitor.figure;

public abstract class Visitor {

    abstract void visitCircle(Circle circulo);

    abstract void visitSquare(Square circulo);

    abstract void visitTriangle(Triangle circulo);

    abstract double getSum();
}
