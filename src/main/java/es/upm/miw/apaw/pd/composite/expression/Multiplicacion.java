package es.upm.miw.apaw.pd.composite.expression;

public class Multiplicacion extends Operation {

    public Multiplicacion(Expression expression1, Expression expression2) {
        super(expression1, expression2);
    }

    @Override
    public int operar() {
        return getExpression1().operar() * getExpression2().operar();
    }

    @Override
    public String toString() {
        return "(" + getExpression1().toString() + "*" + getExpression2().toString() + ")";
    }

}
