package es.upm.miw.apaw.pd.calculator.deshacer;

public class MementoCalculadora {

    private int total;

    public MementoCalculadora(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
