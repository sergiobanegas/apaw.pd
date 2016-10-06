package es.upm.miw.apaw.pd.visitor.figure;

public interface Visitor {

    void visitCircle(Circle circulo);

    void visitSquare(Square circulo);

    void visitTriangle(Triangle circulo);

    double getSum();
}
