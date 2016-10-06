package es.upm.miw.apaw.pd.calculator;

import upm.jbb.IO;

public class SubtractCommand extends ComandoAbstract {

    public SubtractCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public void execute() {
        getCalculator().subtract(IO.getIO().readInt());
    }

    @Override
    public String name() {
        return "Resta";
    }
}
