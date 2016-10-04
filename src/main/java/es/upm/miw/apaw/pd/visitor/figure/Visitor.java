package es.upm.miw.apaw.pd.visitor.figure;

public abstract class Visitor {

    abstract double visitCircle(Circle circulo);

    abstract double visitSquare(Square circulo);

    abstract double visitTriangle(Triangle circulo);

}
