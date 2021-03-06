package homework.library.model;

public class Genre {
    protected int id;
    protected String name;
    protected String description;

    public Genre(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    public Genre(String name) {
        this.name = name;
    }
    public Genre() {
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
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        String idinfo = this.id != 0 ? " id:" + id + " " : " ";
        String descriptioninfo = this.description != null ? "; КРАТКОЕ ОПИСАНИЕ: " + description : " ";
        return idinfo
                + name
                + descriptioninfo + "";
    }

}
