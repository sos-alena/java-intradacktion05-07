package homework.library.controller;

import homework.library.database.AuthorData;
import homework.library.model.Author;
import homework.library.model.Book;

import java.io.IOException;
import java.util.ArrayList;

import static homework.library.Validation.inputValidateNumber;
import static homework.library.Validation.inputValidateStr;

public class AuthorController {
    protected Author author;
    protected ArrayList<Author> authors;

    public AuthorController(ArrayList<Author> authors) {
        this.authors = authors;
    }

    protected Author authorFind() throws IOException {
        System.out.println("Поиск автора по фамилии. ");
        System.out.println("---------------------------");
        System.out.println("Введите фамилию автора: ");

        String str = inputValidateStr();
        for (Author author : authors) {
            if (str.equalsIgnoreCase(author.getSurname())) {
                System.out.println("Автор есть в списке: " + author);
                return author;
            }
        }
        System.out.println("Элемент не найден. Создайте новый элемент.");
        return null;
    }

    protected ArrayList<Book> authorCreateListBook() throws IOException {
        ArrayList<Book> books = new ArrayList<>();
        do {
            System.out.println("Для создания нового автора создайте список его произведений. " +
                    "Введите название книги: ");
            String title = inputValidateStr();
            Book book = new Book(title);
            books.add(book);
            System.out.println("Для добавления следующей книги в 'Список литературы'" +
                    " нажмите ENTER или <stop> для завершения");

        } while (!inputValidateStr().equalsIgnoreCase("stop"));
        return books;
    }
    protected void authorCreate() throws IOException {

                ArrayList<Book> books = authorCreateListBook();
                    author = new Author(books);
                    int id = AuthorData.COUNT++;
                    author.setNumb(id);

                    System.out.println("Введитe фамилию автора: ");
                    String surname = inputValidateStr();
                    author.setSurname(surname);

                    System.out.println("Введитe имя автора: ");
                    String name = inputValidateStr();
                    author.setName(name);
                    System.out.println(author);

                    authors.add(author);
                    System.out.println("Автор создан и добавлен в базу данных");

    }
    protected void authorDelete(){

        System.out.println("Введите номер строки которую желаете удалить удалить");
        int x = inputValidateNumber(0, authors.size());
        authors.remove(x - 1);
        System.out.println("Строка - " + x + " удалена!");
        authorPrintList();
    }
    protected void authorPrintList() {
        System.out.println("-----------------------------------------------------");
        System.out.println("СПИСОК АВТОРОВ: ");
        System.out.println("------------------------------------------------------");
        for (Author author : authors) {
            System.out.println(author);
        }
    }
}