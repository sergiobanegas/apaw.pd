package es.upm.miw.apaw.pd.vehicle;

public class Vehiculo implements VehiculoAbstracto {

    private String modelo;

    private double precio;

    public Vehiculo(String modelo, double precio) {
        this.modelo = modelo;
        this.precio = precio;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

}
