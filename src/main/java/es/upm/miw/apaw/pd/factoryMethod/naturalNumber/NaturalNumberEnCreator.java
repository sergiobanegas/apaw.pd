package es.upm.miw.apaw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEnCreator implements NaturalNumberCreator {

    @Override
    public NaturalNumber createNaturalNumber(int number) {
        return new NaturalNumberEn(number);
    }

}
