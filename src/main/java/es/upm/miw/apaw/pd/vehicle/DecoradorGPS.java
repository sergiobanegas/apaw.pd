package es.upm.miw.apaw.pd.vehicle;

public class DecoradorGPS extends Decorador {

    public DecoradorGPS(VehiculoAbstracto vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String getModelo() {
        return vehiculo.getModelo() + " + GPS";
    }

    @Override
    public double getPrecio() {
        return vehiculo.getPrecio() + 200;
    }

}
