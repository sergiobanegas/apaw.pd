package es.upm.miw.apaw.pd.calculator.deshacer;

import es.upm.miw.apaw.pd.calculator.Calculator;
import es.upm.miw.apaw.pd.calculator.ComandoAbstract;

public abstract class MementoCommand extends ComandoAbstract {
     
    private CalculadoraMementable calculatorMementable;
    
    public MementoCommand(Calculator calculator) {
        super(calculator);
        calculatorMementable=(CalculadoraMementable) calculator;
    }
    
    protected CalculadoraMementable getCalculatorMementable() {
        return calculatorMementable;
    }

}
