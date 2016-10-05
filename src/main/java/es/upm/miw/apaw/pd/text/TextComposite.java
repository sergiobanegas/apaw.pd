package es.upm.miw.apaw.pd.text;

import java.util.ArrayList;
import java.util.List;

public abstract class TextComposite implements TextComponent {

    protected List<TextComponent> components;

    public TextComposite() {
        this.components = new ArrayList<>();
    }

    public boolean isComposite() {
        return true;
    }

    @Override
    public String toString() {
        String string = "";
        for (TextComponent component : components) {
            string += component.toString();
        }
        return string;
    }

    @Override
    public String toStringUpperCase() {
        String string = "";
        for (TextComponent component : components) {
            string += component.toStringUpperCase();
        }
        return string;
    }

}
