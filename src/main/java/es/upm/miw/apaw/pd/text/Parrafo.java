package es.upm.miw.apaw.pd.text;

public class Parrafo extends TextComposite {

    @Override
    public void add(TextComponent component) {
        if (!component.isComposite()) {
            getComponents().add(component);
        } else {
            throw new UnsupportedOperationException();
        }

    }

    @Override
    public void remove(TextComponent component) {
        if (!component.isComposite()) {
            getComponents().remove(component);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n";
    }

    @Override
    public String toStringUpperCase() {
        return toString().toUpperCase();
    }

}
