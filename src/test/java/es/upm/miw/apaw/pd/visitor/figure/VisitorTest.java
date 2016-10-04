package es.upm.miw.apaw.pd.visitor.figure;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class VisitorTest {
    private Collection<Figure> coleccion = new ArrayList<Figure>();

    @Before
    public void ini() {
        coleccion.add(new Circle("Circulo 1", 2));
        coleccion.add(new Square("Cuadrado", 3));
        coleccion.add(new Circle("Circulo 2", 5));
        coleccion.add(new Triangle("Triangulo", 4, 5));
    }

    @Test
    public void testVisitorArea() {
        Visitor visitor = new VisitorArea();
        double result = 0.0;
        for (Figure figura : coleccion) {
            result = +figura.accept(visitor);
        }
        assertEquals(10, result, 1e-3);
    }
    
    @Test
    public void testVisitorArea2() {
        coleccion=new ArrayList<Figure>();
        coleccion.add(new Square("Cuadrado", 7));
        coleccion.add(new Triangle("Triangulo", 2, 3));
        Visitor visitor = new VisitorArea();
        double result = 0.0;
        for (Figure figura : coleccion) {
            result = +figura.accept(visitor);
        }
        assertEquals(3, result, 1e-3);
    }

    @Test
    public void testVisitorNumberOfSides() {
        double result = 0;
        Visitor visitor = new VisitorNumberOfSides();
        for (Figure figura : coleccion) {
            result += figura.accept(visitor);
        }
        assertEquals(Double.POSITIVE_INFINITY, result, 1e-3);
    }
    
    @Test
    public void testVisitorNumberOfSides2() {
        coleccion=new ArrayList<Figure>();
        coleccion.add(new Square("Cuadrado", 7));
        coleccion.add(new Triangle("Triangulo", 2, 3));
        double result = 0;
        Visitor visitor = new VisitorNumberOfSides();
        for (Figure figura : coleccion) {
            result += figura.accept(visitor);
        }
        assertEquals(7, result, 1e-3);
    }

}
