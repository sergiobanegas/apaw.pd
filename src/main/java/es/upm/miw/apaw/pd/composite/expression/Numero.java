package es.upm.miw.apaw.pd.composite.expression;

public class Numero implements Expression {

    private int number;

    public Numero(int number) {
        this.number = number;
    }

    @Override
    public int operar() {
        return number;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }

}
