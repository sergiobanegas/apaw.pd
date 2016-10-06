package es.upm.miw.apaw.pd.calculator.deshacer;

import es.upm.miw.apaw.pd.calculator.AddCommand;
import es.upm.miw.apaw.pd.calculator.CommandManager;
import es.upm.miw.apaw.pd.calculator.PrintCommand;
import es.upm.miw.apaw.pd.calculator.ResetCommand;
import es.upm.miw.apaw.pd.calculator.SubtractCommand;
import upm.jbb.IO;

public class MainMementableCalculator {
    private CommandManager commandManager;

    public MainMementableCalculator() {
        CalculadoraMementable calculator = new CalculadoraMementable(new GestorMementos());
        this.commandManager = new CommandManager();
        this.commandManager.add(new AddCommand(calculator));
        this.commandManager.add(new SubtractCommand(calculator));
        this.commandManager.add(new ResetCommand(calculator));
        this.commandManager.add(new PrintCommand(calculator));
        this.commandManager.add(new SaveCommand(calculator));
        this.commandManager.add(new RestoreCommand(calculator));
    }

    public void execute() {
        String key = (String) IO.getIO().select(this.commandManager.keys());
        this.commandManager.execute(key);
    }

    public static void main(String[] args) {
        IO.getIO().addView(new MainMementableCalculator());
    }
}
