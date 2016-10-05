package es.upm.miw.apaw.pd.text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {

    private static FactoriaCaracter factory;

    private Map<Character, Char> map;

    public FactoriaCaracter() {
        map = new HashMap<Character, Char>();
    }

    public static FactoriaCaracter getInstance() {
        if (factory == null) {
            factory = new FactoriaCaracter();
        }
        return factory;
    }

    public Char get(char character) {
        if (!map.containsKey(character)) {
            map.put(character, new Char(character));
        }
        return map.get(character);
    }
}
