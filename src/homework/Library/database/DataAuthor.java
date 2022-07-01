package homework.Library.database;

import homework.Library.model.Author;

import java.util.ArrayList;

public class DataAuthor {

    public static ArrayList<Author> createDataBaseAuthor() {

        ArrayList<Author> authors = new ArrayList<>();
        Author a = new Author();
        a.setNumb(1);
        a.setName("Томас");
        a.setSurname("Манн");
        authors.add(a);

        Author a2 = new Author();
        a2.setNumb(2);
        a2.setName("Герман");
        a2.setSurname("Гессе");
        authors.add(a2);

        Author a3 = new Author();
        a3.setNumb(3);
        a3.setName("Эрнест");
        a3.setSurname("Хемингуэй");
        authors.add(a3);

        Author a4 = new Author();
        a4.setNumb(4);
        a4.setName("Альбер");
        a4.setSurname("Камю");
        authors.add(a4);

        Author a5 = new Author();
        a5.setNumb(5);
        a5.setName("Агата");
        a5.setSurname("Кристи");
        authors.add(a5);

        Author a6 = new Author();
        a6.setNumb(6);
        a6.setName("Стивен");
        a6.setSurname("Кинг");
        authors.add(a6);

        Author a7 = new Author();
        a7.setNumb(7);
        a7.setName("Джек");
        a7.setSurname("Лондон");
        authors.add(a7);

        return authors;
    }

}
