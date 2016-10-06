package es.upm.miw.apaw.pd.vehicle;

public class DecoradorMP3 extends Decorador {

    public DecoradorMP3(VehiculoAbstracto vehiculo) {
        super(vehiculo);
    }

    @Override
    public String getModelo() {
        return getVehiculo().getModelo() + " + MP3";
    }

    @Override
    public double getPrecio() {
        return getVehiculo().getPrecio() + 100;
    }

}
