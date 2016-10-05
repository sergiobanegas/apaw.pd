package es.upm.miw.apaw.pd.vehicle;

public class DecoradorEDS extends Decorador {

    public DecoradorEDS(VehiculoAbstracto vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String getModelo() {
        return vehiculo.getModelo() + " + EDS";
    }

    @Override
    public double getPrecio() {
        return vehiculo.getPrecio() + 50;
    }

}
