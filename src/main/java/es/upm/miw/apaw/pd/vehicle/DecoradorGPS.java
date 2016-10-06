package es.upm.miw.apaw.pd.vehicle;

public class DecoradorGPS extends Decorador {

    public DecoradorGPS(VehiculoAbstracto vehiculo) {
        super(vehiculo);
    }

    @Override
    public String getModelo() {
        return getVehiculo().getModelo() + " + GPS";
    }

    @Override
    public double getPrecio() {
        return getVehiculo().getPrecio() + 200;
    }

}
