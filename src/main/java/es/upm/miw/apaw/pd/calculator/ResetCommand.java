package es.upm.miw.apaw.pd.calculator;

public class ResetCommand extends ComandoAbstract {

    public ResetCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public void execute() {
        getCalculator().reset();
    }

    @Override
    public String name() {
        return "Reset";
    }

}
