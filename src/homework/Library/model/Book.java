package homework.Library.model;

public class Book {

    int idb;
    String title;
    String description;
    int year;
    Author author;
    Genre genre;

    public Book() {
    }

    public Book(Genre genre, Author author) {
        this.author = author;
        this.genre = genre;
    }

    public int getIdb() {
        return idb;
    }

    public void setIdb(int idb) {
        this.idb = idb;
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
        return "Book{" +
                "Название книги: " + title + '\''
                + ", год выпуска: " + year +
                ", Автор: " + author.surname + " " + author.name +
                ", Жанр: " + genre.name +
                '}';
    }
}
