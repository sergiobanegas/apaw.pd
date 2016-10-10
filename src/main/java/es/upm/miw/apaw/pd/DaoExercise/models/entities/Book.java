package es.upm.miw.apaw.pd.DaoExercise.models.entities;

import java.util.List;

public class Book {
    private int id;

    private String isbn;

    private List<Author> authors;

    private List<Theme> themes;

    public Book() {

    }

    public List<Author> getAuthors() {
        return authors;
    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public List<Theme> getThemes() {
        return themes;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setThemes(List<Theme> themes) {
        this.themes = themes;
    }

}
