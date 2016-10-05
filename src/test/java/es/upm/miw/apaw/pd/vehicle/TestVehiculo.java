package es.upm.miw.apaw.pd.vehicle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestVehiculo {

    private Vehiculo vehiculo;

    @Before
    public void before() {
        this.vehiculo = new Vehiculo("Alfa Romeo gt", 40000);
    }

    @Test
    public void decoratorGPSTest() {
        VehiculoAbstracto vehiculoMejorado = new DecoradorGPS(vehiculo);
        assertEquals(vehiculo.getModelo() + " + GPS", vehiculoMejorado.getModelo());
        assertEquals(40200.0, vehiculoMejorado.getPrecio(), 1e-2);
    }

    @Test
    public void decoratorMP3Test() {
        VehiculoAbstracto vehiculoMejorado = new DecoradorMP3(vehiculo);
        assertEquals(vehiculo.getModelo() + " + MP3", vehiculoMejorado.getModelo());
        assertEquals(40100.0, vehiculoMejorado.getPrecio(), 1e-2);
    }

    @Test
    public void decoratorEDSTest() {
        VehiculoAbstracto vehiculoMejorado = new DecoradorEDS(new DecoradorMP3(vehiculo));
        assertEquals(vehiculo.getModelo() + " + MP3 + EDS", vehiculoMejorado.getModelo());
        assertEquals(40150.0, vehiculoMejorado.getPrecio(), 1e-2);
        vehiculoMejorado = new DecoradorGPS(vehiculoMejorado);
        assertEquals(vehiculo.getModelo() + " + MP3 + EDS + GPS", vehiculoMejorado.getModelo());
        assertEquals(40350.0, vehiculoMejorado.getPrecio(), 1e-2);
    }
}
