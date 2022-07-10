package homework.lesson16.library.model;

import java.util.ArrayList;

public class Author {

    private int id;
    private String surname;
    private String name;
    private ArrayList<Book> books;

    public Author(int id, String surname, String name, ArrayList<Book> books) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.books = books;
    }

    public Author(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public Author(ArrayList<Book> books) {
        this.books = books;
    }

    public String getSurname(int id) {
        this.id = id;
        return surname;
    }

    public String getName(int id) {
        this.id = id;
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String booksinfo = this.books != null ? "; СПИСОК ЛИТЕРАТУРЫ: - " + books : "";
        String idinfo = this.id != 0 ? " id: " + id : "";
        return idinfo +
                "; ФИО Автора: " + name + " " + surname +
                booksinfo;
    }
}
