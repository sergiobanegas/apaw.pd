package es.upm.miw.apaw.pd.vehicle;

public class DecoradorMP3 extends Decorador {

    public DecoradorMP3(VehiculoAbstracto vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String getModelo() {
        return vehiculo.getModelo() + " + MP3";
    }

    @Override
    public double getPrecio() {
        return vehiculo.getPrecio() + 100;
    }

}
