package es.upm.miw.apaw.pd.calculator;

public abstract class ComandoAbstract implements Comando {

    private Calculator calculator;

    ComandoAbstract(Calculator calculator) {
        this.calculator = calculator;
    }

    protected Calculator getCalculator() {
        return calculator;
    }
}
