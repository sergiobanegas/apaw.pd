package es.upm.miw.apaw.pd.factoryMethod.naturalNumber;

public class NaturalNumberFrCreator implements NaturalNumberCreator {

    @Override
    public NaturalNumber createNaturalNumber(int number) {
        return new NaturalNumberFr(number);
    }

}
