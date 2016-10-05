package es.upm.miw.apaw.pd.text;

public interface TextComponent {
    abstract void add(TextComponent component);

    abstract void remove(TextComponent component);

    abstract String toStringUpperCase();

    abstract boolean isComposite();
}
