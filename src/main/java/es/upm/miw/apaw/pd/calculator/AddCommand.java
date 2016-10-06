package es.upm.miw.apaw.pd.calculator;

import upm.jbb.IO;

public class AddCommand extends ComandoAbstract {

    public AddCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public void execute() {
        getCalculator().add(IO.getIO().readInt());
    }

    @Override
    public String name() {
        return "Suma";
    }

}
