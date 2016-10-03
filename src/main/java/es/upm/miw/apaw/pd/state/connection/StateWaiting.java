package es.upm.miw.apaw.pd.state.connection;

public class StateWaiting extends State {

    @Override
    public void recibir(Conexion conexion, int respuesta) {
        if (respuesta == 0) {
            conexion.setState(new StateReady());
        } else {
            conexion.setState(new StateClosed());
        }
    }

    @Override
    public Estado getState() {
        return Estado.ESPERANDO;
    }

}
