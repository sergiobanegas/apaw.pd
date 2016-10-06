package es.upm.miw.apaw.pd.calculator.deshacer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorMementos {

    private Map<String, MementoCalculadora> mementos;

    public GestorMementos() {
        mementos = new HashMap<String, MementoCalculadora>();
    }

    public void addMemento(String name, MementoCalculadora memento) {
        mementos.put(name, memento);
    }

    public MementoCalculadora getMemento(String name) {
        return mementos.get(name);
    }

    public List<String> getMementos() {
        return new ArrayList<>(mementos.keySet());
    }
}
