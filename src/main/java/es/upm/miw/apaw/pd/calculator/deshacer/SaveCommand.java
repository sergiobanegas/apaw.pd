package es.upm.miw.apaw.pd.calculator.deshacer;

import es.upm.miw.apaw.pd.calculator.Calculator;
import upm.jbb.IO;

public class SaveCommand extends MementoCommand {

    public SaveCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public void execute() {
        getCalculatorMementable().createMemento(IO.getIO().readString("¿Qué nombre quieres dar al estado actual?"));
    }

    @Override
    public String name() {
        return "Save";
    }

}
