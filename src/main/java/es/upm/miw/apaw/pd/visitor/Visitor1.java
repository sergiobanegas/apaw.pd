package es.upm.miw.apaw.pd.visitor;

public class Visitor1 implements Visitor {

    @Override
    public void visitElementA(ElementA e) {
        System.out.println("Visitador 1 --> elemento: " + e.getAttributeA());
    }

    @Override
    public void visitElementB(ElementB e) {
        System.out.println("Visitador 1 --> elemento: " + e.getAttributeB());
    }

}
