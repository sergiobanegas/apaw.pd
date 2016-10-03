package es.upm.miw.apaw.pd.composite.expression;

public abstract class Operation implements Expression {

    protected Expression expression1, expression2;

    public Operation(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public abstract int operar();
}