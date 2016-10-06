package es.upm.miw.apaw.pd.vehicle;

public class DecoradorEDS extends Decorador {

    public DecoradorEDS(VehiculoAbstracto vehiculo) {
        super(vehiculo);
    }

    @Override
    public String getModelo() {
        return getVehiculo().getModelo() + " + EDS";
    }

    @Override
    public double getPrecio() {
        return getVehiculo().getPrecio() + 50;
    }

}
