package es.upm.miw.apaw.pd.text;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TextoTest {
    private TextComponent H, o, l, a, pf, txt;

    @Before
    public void ini() {
        H = FactoriaCaracter.getInstance().get('H');
        o = FactoriaCaracter.getInstance().get('o');
        l = FactoriaCaracter.getInstance().get('l');
        a = FactoriaCaracter.getInstance().get('a');
        pf = new Parrafo();
        pf.add(H);
        pf.add(o);
        pf.add(l);
        pf.add(a);
        txt = new Texto();
        txt.add(pf);
        txt.add(pf);
    }

    @Test
    public void testCaracterFlyweight() {
        assertSame(H, FactoriaCaracter.getInstance().get('H'));
    }

    @Test
    public void testCaracterAddCaracter() {
        H.add(o);
    }

    @Test
    public void testDibujarCaracterNormal() {
        assertEquals("o", o.toString());
    }

    @Test
    public void testDibujarCaracterMayusculas() {
        assertEquals("O", o.toStringUpperCase());
    }

    // ----------------------------------------------

    @Test
    public void testParrafoNormal() {
        assertEquals("Hola\n", pf.toString());
    }

    @Test
    public void testParrafoMayusculas() {
        assertEquals("HOLA\n", pf.toStringUpperCase());
    }

    @Test
    public void testParrafoNoAddParrafo() {
        try {
            pf.add(pf);
            fail("");
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

    // ----------------------------------------------

    @Test
    public void testTextoNormal() {
        assertEquals("Hola\nHola\n---o---\n",txt.toString());
    }
    
    @Test
    public void testTextoMayusculas() {
        assertEquals("HOLA\nHOLA\n---o---\n",txt.toStringUpperCase());
    }
    
    @Test
    public void testTextoNoAddCaracter() {
        try {
            txt.add(H);
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

}
