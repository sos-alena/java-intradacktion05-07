package homework.Library.controller;

import homework.Library.Utils;
import homework.Library.database.DataBook;
import homework.Library.model.Book;
import homework.Library.view.ViewBook;

import java.io.IOException;
import java.util.ArrayList;

import static homework.Library.Validation.inputValidateName;

public class ControllerBook {
    public Book book;
    public ViewBook viewB;

    public ControllerBook() {
    }

    public boolean findBook() throws IOException {

        System.out.println("Поиск по названию. ");
        System.out.println("---------------------------");
        System.out.println("Введите название книги: ");

        String str = inputValidateName();
        for (Book b : DataBook.BOOKS) {
            if (str.equalsIgnoreCase(b.getTitle())) {
                System.out.println("Книга есть в списке есть в списке: " + b);
                return true;
            }
        }
        System.out.println("Элемент не найден. Создайте новый элемент.");
        return false;
    }

    public ArrayList<Book> createBookList() throws IOException {

        if (!findBook()) {
            do {

                viewB = new ViewBook();
                book = viewB.createBook();
                DataBook.BOOKS.add(book);
                System.out.println(book);
                System.out.println("Нажмите ENTER для введения новой ниги или, введите <stop> для завершения");
            }
            while (!Utils.READER.readLine().equalsIgnoreCase("stop"));
        }
        printBook(DataBook.BOOKS);
        return DataBook.BOOKS;
    }

    public ArrayList<Book> deleteBook() throws IOException {

        System.out.println("Введите название книги которую желаете удалить: ");
        String str = inputValidateName();
        for (Book b : DataBook.BOOKS) {
            if (str.equalsIgnoreCase(b.getTitle())) {
                System.out.println("Книга есть в списке есть в списке: " + b);
                DataBook.BOOKS.remove(b);
                return DataBook.BOOKS;
            }
        }
        System.out.println("Элемент не найден");
        return null;
    }

    public void printBook(ArrayList<Book> books) {
        System.out.println("-----------------------------------------------------");
        System.out.println("СПИСОК КНИГ: ");
        System.out.println("------------------------------------------------------");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
