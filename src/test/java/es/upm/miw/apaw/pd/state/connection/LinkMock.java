package es.upm.miw.apaw.pd.state.connection;

public final class LinkMock implements Link {
    private String msg;

    private int respuesta;

    public String getMsg() {
        return msg;
    }

    public int getRespuesta() {
        return respuesta;
    }

    @Override
    public void enviar(String msg) {
        this.msg = msg;
    }

    @Override
    public void recibir(int respuesta) {
        this.respuesta = respuesta;
    }

}
