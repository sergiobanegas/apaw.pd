package es.upm.miw.apaw.pd.state.connection;

public class StateReady extends State {

    @Override
    public void abrir(Conexion conexion) {
    }

    @Override
    public void cerrar(Conexion conexion) {
        conexion.setState(new StateClosed());
    }

    @Override
    public void parar(Conexion conexion) {
        conexion.setState(new StateStopped());
    }

    @Override
    public void iniciar(Conexion conexion) {
    }

    @Override
    public void enviar(Conexion conexion, String msg) {
        conexion.sendMessage(msg);
        conexion.setState(new StateWaiting());

    }

    @Override
    public Estado getState() {
        return Estado.PREPARADO;
    }

}
