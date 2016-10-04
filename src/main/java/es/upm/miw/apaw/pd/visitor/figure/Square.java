package es.upm.miw.apaw.pd.visitor.figure;

public class Square extends Figure {

    private double side;

    public Square(String description, double side) {
        super(description);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visitSquare(this);
    }

}
