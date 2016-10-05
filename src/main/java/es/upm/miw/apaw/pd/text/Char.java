package es.upm.miw.apaw.pd.text;

public class Char implements TextComponent {
    private char character;

    public Char(char character) {
        this.character = character;
    }

    @Override
    public void add(TextComponent component) {

    }

    @Override
    public String toString() {
        return String.valueOf(character);
    }

    @Override
    public String toStringUpperCase() {
        return (String.valueOf(character)).toUpperCase();
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public void remove(TextComponent component) {

    }

}
