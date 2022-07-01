package homework.Library.model;

public class Author {

    public String surname;
    public String name;
    int numb;
    Book book;

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

    public int getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return " №id: " + numb + "; "
                + " ФИО АВТОРА: " + name + " " + surname + "\n"+
                 "----------------------------";
    }
}
