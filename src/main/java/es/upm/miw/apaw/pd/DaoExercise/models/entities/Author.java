package es.upm.miw.apaw.pd.DaoExercise.models.entities;

public class Author {
    private int id;

    private String name;

    private String surname;

    private Contact contact;

    private Style style;

    public Author() {
        // TODO Auto-generated constructor stub
    }

    public Contact getContact() {
        return contact;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Style getStyle() {
        return style;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setStyle(Style style) {
        this.style = style;
    }
}
