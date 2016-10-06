package es.upm.miw.apaw.pd.calculator.deshacer;

import es.upm.miw.apaw.pd.calculator.Calculator;
import es.upm.miw.apaw.pd.calculator.ComandoAbstract;
import upm.jbb.IO;

public class RestoreCommand extends ComandoAbstract {

    public RestoreCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public void execute() {
        ((CalculadoraMementable)getCalculator()).restoreMemento((String) IO.getIO().select(((CalculadoraMementable)getCalculator()).getMementos().toArray()));
    }

    @Override
    public String name() {
        return "Restore";
    }

}
