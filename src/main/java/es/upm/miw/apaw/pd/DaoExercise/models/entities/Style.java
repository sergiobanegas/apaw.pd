package es.upm.miw.apaw.pd.DaoExercise.models.entities;

public class Style {
    private int id;

    private String name;

    private String description;

    public Style() {
        // TODO Auto-generated constructor stub
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
