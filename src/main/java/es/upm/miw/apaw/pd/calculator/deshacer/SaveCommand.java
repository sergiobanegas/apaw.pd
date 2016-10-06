package es.upm.miw.apaw.pd.calculator.deshacer;

import es.upm.miw.apaw.pd.calculator.Calculator;
import es.upm.miw.apaw.pd.calculator.ComandoAbstract;
import upm.jbb.IO;

public class SaveCommand extends ComandoAbstract {

    public SaveCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public void execute() {
        ((CalculadoraMementable)getCalculator()).createMemento(IO.getIO().readString("¿Qué nombre quieres dar al estado actual?"));
    }

    @Override
    public String name() {
        return "Save";
    }

}
