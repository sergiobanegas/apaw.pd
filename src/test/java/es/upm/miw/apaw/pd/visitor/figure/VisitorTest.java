package es.upm.miw.apaw.pd.visitor.figure;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VisitorTest {
    private FiguresManager figureManager = new FiguresManager();

    @Before
    public void ini() {
        figureManager.add(new Circle("Circulo 1", 2));
        figureManager.add(new Square("Cuadrado", 3));
        figureManager.add(new Circle("Circulo 2", 5));
        figureManager.add(new Triangle("Triangulo", 4, 5));
    }

    @Test
    public void testVisitorArea() {
        assertEquals(110.11, figureManager.totalArea(), 1e-2);
    }

    @Test
    public void testVisitorArea2() {
        figureManager = new FiguresManager();
        figureManager.add(new Square("Cuadrado", 7));
        figureManager.add(new Triangle("Triangulo", 2, 3));
        assertEquals(52, figureManager.totalArea(), 1e-3);
    }

    @Test
    public void testVisitorNumberOfSides() {
        assertEquals(Double.POSITIVE_INFINITY, figureManager.totalNumberOfSides(), 1e0);
    }

    @Test
    public void testVisitorNumberOfSides2() {
        figureManager = new FiguresManager();
        figureManager.add(new Square("Cuadrado", 7));
        figureManager.add(new Triangle("Triangulo", 2, 3));
        assertEquals(7, figureManager.totalNumberOfSides(), 1e0);
    }

}
