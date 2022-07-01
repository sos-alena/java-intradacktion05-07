package homework.Library.model;

public class Genre {
    public int id;
    public String name;
    public String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getName(int id) {
        this.id = id;
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return " №id: " + id + "; "
                + " НАЗВАНИЕ: " + name + "\n"
                + "КРАТКОЕ ОПИСАНИЕ: " + description + "----------------------------";
    }

}
