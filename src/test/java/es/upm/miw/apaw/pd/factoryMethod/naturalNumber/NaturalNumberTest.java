package es.upm.miw.apaw.pd.factoryMethod.naturalNumber;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NaturalNumberTest {

    private NaturalNumberManager manager;

    @Before
    public void before() {
        manager = new NaturalNumberManager(5);
    }

    @Test
    public void testNaturalNumberEn() {
        manager.setNaturalNumberCreator(new NaturalNumberEnCreator());
        assertEquals("five", manager.createNaturalNumber().getTextValue());
    }

    @Test
    public void testNaturalNumberJp() {
        manager.setNaturalNumberCreator(new NaturalNumberJpCreator());
        assertEquals("五", manager.createNaturalNumber().getTextValue());
    }

    @Test
    public void testNaturalNumberEs() {
        manager = new NaturalNumberManager(3);
        manager.setNaturalNumberCreator(new NaturalNumberEsCreator());
        assertEquals("tres", manager.createNaturalNumber().getTextValue());
    }

    @Test
    public void testNaturalNumberFr() {
        manager = new NaturalNumberManager(2);
        manager.setNaturalNumberCreator(new NaturalNumberFrCreator());
        assertEquals("deux", manager.createNaturalNumber().getTextValue());
    }
}
