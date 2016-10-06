package es.upm.miw.apaw.pd.calculator.deshacer;

import es.upm.miw.apaw.pd.calculator.Calculator;
import upm.jbb.IO;

public class RestoreCommand extends MementoCommand {

    public RestoreCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public void execute() {
        getCalculatorMementable().restoreMemento((String) IO.getIO().select(getCalculatorMementable().getMementos().toArray()));
    }

    @Override
    public String name() {
        return "Restore";
    }

}
