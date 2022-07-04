package homework.Library.controller;

import homework.Library.Utils;
import homework.Library.database.DataAuthor;
import homework.Library.model.Author;
import homework.Library.model.Book;
import homework.Library.view.ViewAuthor;

import java.io.IOException;
import java.util.ArrayList;

import static homework.Library.Validation.inputValidateName;

public class ControllerAuthor {

    public Author author;
    public ViewAuthor viewA;

    public boolean findAuthor() throws IOException {

        System.out.println("Поиск автора по фамилии. ");
        System.out.println("---------------------------");
        System.out.println("Введите фамилию автора: ");

        String str = inputValidateName();
        for (Author a : DataAuthor.AUTHORS) {
            if (str.equalsIgnoreCase(a.getSurname())) {
                System.out.println("Автор есть в списке: " + a);
                return true;
            }
        }
        System.out.println("Элемент не найден. Создайте новый элемент.");
        return false;
    }

    public ArrayList<Book> createBookListAuthor() throws IOException {
        ArrayList<Book> books = new ArrayList<>();
        do {
            System.out.println("Введите название книги: ");
            String title = inputValidateName();
            Book book = new Book(title);
            books.add(book);
            System.out.println("Для добавления книге 'Список литературы' нажмите ENTER или <stop> для завершения");

        } while (!Utils.READER.readLine().equalsIgnoreCase("stop"));
        return books;
    }

    public void createAuthor() throws IOException {
        if (!findAuthor()) {
            do {
                ArrayList<Book> books = createBookListAuthor();
                author = new Author(books);
                viewA = new ViewAuthor(author);
                viewA.getInputsGenre();
                DataAuthor.AUTHORS.add(author);

                System.out.println("Нажмите ENTER для создания нового автора или <stop> для завершения");
            }
            while (!Utils.READER.readLine().equalsIgnoreCase("stop"));
        }
        printListAuthor(DataAuthor.AUTHORS);
    }

    public void deleteAuthor() throws IOException {

        System.out.println("Введите номер строки которую желаете удалить удалить");
        int x = Integer.parseInt(inputValidateName());
        DataAuthor.AUTHORS.remove(x - 1);
        printListAuthor(DataAuthor.AUTHORS);
    }

    public void printListAuthor(ArrayList<Author> authors) {
        System.out.println("-----------------------------------------------------");
        System.out.println("СПИСОК АВТОРОВ: ");
        System.out.println("------------------------------------------------------");
        for (Author author : authors) {
            System.out.println(author);
        }
    }
}