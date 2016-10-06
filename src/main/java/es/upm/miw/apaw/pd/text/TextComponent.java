package es.upm.miw.apaw.pd.text;

public interface TextComponent {
    void add(TextComponent component);

    void remove(TextComponent component);

    String toStringUpperCase();

    boolean isComposite();
}
