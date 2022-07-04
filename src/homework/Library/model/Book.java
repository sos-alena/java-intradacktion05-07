package homework.Library.model;

public class Book {

    protected int id;
    protected String title;
    protected String description;
    protected int year;
    protected Author author;
    protected Genre genre;

    public Book() {
    }
    public Book(String title) {
        this.title = title;
    }
    public Book(Genre genre, Author author) {
        this.author = author;
        this.genre = genre;
    }
    public Book(int id, String title, String description, int year, Author author, Genre genre) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.year = year;
        this.author = author;
        this.genre = genre;
    }
    public int getIdb() {
        return id;
    }

    public void setIdb(int idb) {
        this.id = idb;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        String idinfo = this.id != 0 ? "id " + id + "; " : "";
        String yearinfo = this.year != 0 ? "год выпуска - " + year : "";
        String autorinfo = this.author != null ? " [автор:" + author + "]" : "";
        String genreinfo = this.genre != null ? " [жанр: " + genre + "]" : "";
        return  idinfo + " '" +
                title + "' " +
                yearinfo +
                autorinfo +
                genreinfo;
      }
}
