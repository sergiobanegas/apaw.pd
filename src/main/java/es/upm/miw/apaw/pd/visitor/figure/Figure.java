package es.upm.miw.apaw.pd.visitor.figure;

public abstract class Figure {

    private String description;

    public Figure(String description) {
        this.description = description;
    }

    public abstract double accept(Visitor visitor);

    @Override
    public String toString() {
        return this.description;
    }

}
