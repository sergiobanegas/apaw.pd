package es.upm.miw.apaw.pd.state.connection;

public class StateStopped extends State {

    @Override
    public void parar(Conexion conexion) {
    }

    @Override
    public void iniciar(Conexion conexion) {
        conexion.setState(new StateReady());
    }

    @Override
    public Estado getState() {
        return Estado.PARADO;
    }

}
