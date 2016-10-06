package es.upm.miw.apaw.pd.vehicle;

public abstract class Decorador implements VehiculoAbstracto {

    private VehiculoAbstracto vehiculo;

    Decorador(VehiculoAbstracto vehiculo) {
        this.vehiculo = vehiculo;
    }

    protected VehiculoAbstracto getVehiculo() {
        return vehiculo;
    }
}
