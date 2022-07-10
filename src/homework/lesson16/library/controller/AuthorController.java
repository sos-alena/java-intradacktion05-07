package homework.lesson16.library.controller;

import homework.lesson16.library.database.AuthorData;
import homework.lesson16.library.model.Author;
import homework.lesson16.library.model.Book;

import java.io.IOException;
import java.util.ArrayList;

import static homework.lesson16.library.Validation.inputValidateNumber;
import static homework.lesson16.library.Validation.inputValidateStr;

public class AuthorController {
    private Author author;
    private ArrayList<Author> authors;

    public AuthorController(ArrayList<Author> authors) {
        this.authors = authors;
    }

    public Author authorFind() throws IOException {
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

    public ArrayList<Book> authorCreateListBook() throws IOException {
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
        public void authorCreate() throws IOException {

                ArrayList<Book> books = authorCreateListBook();
                    author = new Author(books);
                    int id = AuthorData.COUNT++;
                    author.setId(id);

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
    public void authorDelete(){

        System.out.println("Введите номер строки которую желаете удалить удалить");
        int x = inputValidateNumber(0, authors.size());
        authors.remove(x - 1);
        System.out.println("Строка - " + x + " удалена!");
        authorPrintList();
    }
    public void authorPrintList() {
        System.out.println("-----------------------------------------------------");
        System.out.println("СПИСОК АВТОРОВ: ");
        System.out.println("------------------------------------------------------");
        for (Author author : authors) {
            System.out.println(author);
        }
    }
}