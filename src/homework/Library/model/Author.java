package homework.Library.model;

import java.util.ArrayList;

public class Author {

    public int numb;
    private String surname;
    private String name;
    private ArrayList<Book> books;
    public Author() {
    }
    public Author(int numb, String surname, String name, ArrayList<Book> books) {
        this.numb = numb;
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

    public String getSurname() {
        return surname;
    }
    public String getSurname(int numb) {
        this.numb = numb;
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }

    public String getName(int numb) {
        this.numb = numb;
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumb() {
        return numb;
    }
    public void setNumb(int numb) {
        this.numb = numb;
    }

    @Override
    public String toString() {
        String bookinfo = this.books != null ? "; СПИСОК ЛИТЕРАТУРЫ: - " + books : "";
        String idinfo = this.numb != 0 ? " id: " + numb :"";
        return idinfo +
                "; ФИО Автора: " + name + " " + surname +
               bookinfo;
    }
}
