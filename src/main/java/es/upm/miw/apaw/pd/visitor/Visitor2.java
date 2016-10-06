package es.upm.miw.apaw.pd.visitor;

public class Visitor2 implements Visitor {

    private int numberOfAs = 0;

    private int numberOfBs = 0;

    @Override
    public void visitElementA(ElementA e) {
        numberOfAs += 1;
    }

    @Override
    public void visitElementB(ElementB e) {
        numberOfBs += 1;
    }

    public int getAs() {
        return numberOfAs;
    }

    public int getBs() {
        return numberOfBs;
    }

}
