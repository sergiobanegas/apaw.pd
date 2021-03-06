package es.upm.miw.apaw.pd.text;

public class Texto extends TextComposite {

    @Override
    public void add(TextComponent component) {
        if (component.isComposite()) {
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
        return super.toString() + "---o---\n";
    }

    @Override
    public String toStringUpperCase() {
        return super.toString().toUpperCase() + "---o---\n";
    }

}
