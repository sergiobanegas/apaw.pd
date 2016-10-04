package es.upm.miw.apaw.pd.factoryMethod.naturalNumber;

public class NaturalNumberJpCreator implements NaturalNumberCreator {

    @Override
    public NaturalNumber createNaturalNumber(int number) {
        return new NaturalNumberJp(number);
    }

}
