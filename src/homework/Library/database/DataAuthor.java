package homework.Library.database;

import homework.Library.model.Author;
import homework.Library.model.Book;

import java.util.ArrayList;

public class DataAuthor {
    public static ArrayList<Author> AUTHORS = new ArrayList<>();
    public static int COUNT = 1;
    public ArrayList<Author> DataBaseAuthor() {

        ArrayList<Book> booksTM = new ArrayList<>();
        booksTM.add(new Book("Смерть под парусом"));
        booksTM.add(new Book("Доктор фауст"));
        booksTM.add(new Book("Будденброки"));
        AUTHORS.add(new Author(COUNT++, "Манн", "Томас", booksTM));

        ArrayList<Book> booksGG = new ArrayList<>();
        booksGG.add(new Book("Степной волк"));
        booksGG.add(new Book("Игра в бисер"));
        booksGG.add(new Book("Демиан"));
        AUTHORS.add(new Author(COUNT++, "Гессе", "Герман", booksGG));

        ArrayList<Book> booksEH = new ArrayList<>();
        booksEH.add(new Book("Старик и море"));
        booksEH.add(new Book("По ком звонит колокол"));
        booksEH.add(new Book("Праздник, который всегда с тобой"));
        AUTHORS.add(new Author(COUNT++, "Хемингуэй", "Эрнест", booksEH));

        ArrayList<Book> booksAK = new ArrayList<>();
        booksAK.add(new Book("Посторонний"));
        booksAK.add(new Book("Чума"));
        booksAK.add(new Book("Падение"));
        AUTHORS.add(new Author(COUNT++, "Камю", "Альберт", booksAK));

        ArrayList<Book> booksAKr = new ArrayList<>();
        booksAKr.add(new Book("Убийство в восточном экспрессе"));
        booksAKr.add(new Book("Смерь на Ниле"));
        booksAKr.add(new Book("Скрюченный домишко"));
        AUTHORS.add(new Author(COUNT++, "Кристи", "Агата", booksAKr));

        ArrayList<Book> booksSK = new ArrayList<>();
        booksSK.add(new Book("Сияние"));
        booksSK.add(new Book("Оно"));
        AUTHORS.add(new Author(COUNT++, "Кинг", "Стивен", booksSK));

        ArrayList<Book> booksPK = new ArrayList<>();
        booksPK.add(new Book("Алхимик"));
        AUTHORS.add(new Author(COUNT++, "Коэльо", "Пауло", booksPK));

        ArrayList<Book> booksGL = new ArrayList<>();
        booksGL.add(new Book("Белый Клык"));
        booksGL.add(new Book("Морской волк"));
        AUTHORS.add(new Author(COUNT++, "Лондон", "Джек", booksGL));

        ArrayList<Book> booksSH = new ArrayList<>();
        booksSH.add(new Book("Краткая история времени"));
        AUTHORS.add(new Author(COUNT++, "Хокинг", "Стивен", booksSH));

        return AUTHORS;
    }
}
