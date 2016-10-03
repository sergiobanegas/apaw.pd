package es.upm.miw.apaw.pd.state.connection;

public class StateClosed extends State {

    @Override
    public void abrir(Conexion conexion) {
        conexion.setState(new StateReady());
    }

    @Override
    public void cerrar(Conexion conexion) {
    }

    @Override
    public Estado getState() {
        return Estado.CERRADO;
    }
}
