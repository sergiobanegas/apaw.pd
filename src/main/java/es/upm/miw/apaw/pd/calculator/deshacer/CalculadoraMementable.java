package es.upm.miw.apaw.pd.calculator.deshacer;

import java.util.List;

import es.upm.miw.apaw.pd.calculator.Calculator;

public class CalculadoraMementable extends Calculator {

    private GestorMementos gestor;

    public CalculadoraMementable(GestorMementos gestor) {
        super();
        this.gestor = gestor;
    }

    public MementoCalculadora createMemento(String name) {
        MementoCalculadora memento = new MementoCalculadora(getTotal());
        gestor.addMemento(name, memento);
        return memento;
    }

    public void restoreMemento(String name) {
        setTotal(getMemento(name).getTotal());
    }

    private MementoCalculadora getMemento(String name) {
        return gestor.getMemento(name);
    }

    public List<String> getMementos() {
        return gestor.getMementos();
    }
}
