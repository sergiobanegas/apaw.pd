package es.upm.miw.apaw.pd.composite.expression;

public class Suma extends Operation {

    public Suma(Expression expression1, Expression expression2) {
        super(expression1, expression2);
    }

    @Override
    public int operar() {
        return expression1.operar() + expression2.operar();
    }

    @Override
    public String toString() {
        return "(" + expression1.operar() + "+" + expression2.operar() + ")";
    }

}
