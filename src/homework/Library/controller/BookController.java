package homework.library.controller;

import homework.library.database.BookData;
import homework.library.model.Author;
import homework.library.model.Book;
import homework.library.model.Genre;

import java.io.IOException;
import java.util.ArrayList;

import static homework.library.Validation.inputValidateNumber;
import static homework.library.Validation.inputValidateStr;

public class BookController {

    protected Book book;
    protected ArrayList<Book> books;

    public BookController(ArrayList<Book> books) {
        this.books = books;
    }

    protected Book bookFind() throws IOException {

        System.out.println("Поиск по названию. ");
        System.out.println("---------------------------");
        System.out.println("Введите название книги: ");

        String str = inputValidateStr();
        for (Book book : books) {
            if (str.equalsIgnoreCase(book.getTitle())) {
                System.out.println("Книга есть в списке есть в списке: " + book);
                return book;
            }
        }
        System.out.println("Элемент не найден. Создайте новый элемент.");
        return null;
    }
    protected void bookCreate(ArrayList<Genre> genres, ArrayList<Author> authors) throws IOException {
        GenreController genreController = new GenreController(genres);
        genreController.genrePrintList();
        System.out.println("Введите номер жанра из списка: ");
        int z = inputValidateNumber(0, genres.size());
        Genre genre = genres.get(z - 1);
        genre = new Genre(genre.getName(z - 1));

        AuthorController authorController = new AuthorController(authors);
        authorController.authorPrintList();
        System.out.println("Введите номер автора из списка: ");
        int numb = inputValidateNumber(0, authors.size());
        Author author = authors.get(numb - 1);
        author = new Author(author.getSurname(numb - 1), author.getName(numb - 1));

        book = new Book(genre, author);

        int id = BookData.COUNT++;
        book.setIdb(id);

        System.out.println("Введите название книги: ");
        String title = inputValidateStr();
        book.setTitle(title);

        System.out.println("Введите краткое описание: ");
        String description = inputValidateStr();
        book.setDescription(description);

        System.out.println("Введите год выпуска: ");
        int year = inputValidateNumber(1500, 2022);
        book.setYear(year);

        books.add(book);
        System.out.println(book);
    }

    protected ArrayList<Book> bookDelete() throws IOException {

        System.out.println("Введите название книги которую желаете удалить: ");
        String str = inputValidateStr();
        for (Book book : books) {
            if (str.equalsIgnoreCase(book.getTitle())) {
                System.out.println("Книга есть в списке и будет удалена: " + book);
                books.remove(book);
                return books;
            }
        } System.out.println("Элемент не найден");
        return books;
    }

    protected void bookPrint() {
        System.out.println("-----------------------------------------------------");
        System.out.println("СПИСОК КНИГ: ");
        System.out.println("------------------------------------------------------");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
