package homework.Library.view;

import homework.Library.database.DataAuthor;
import homework.Library.database.DataBook;
import homework.Library.database.DataGenre;
import homework.Library.model.Author;
import homework.Library.model.Book;
import homework.Library.model.Genre;

import java.io.IOException;

import static homework.Library.Validation.*;

public class ViewBook {

    protected Book book;
    protected String message;
    protected Author author;
    protected Genre genre;
        public Book createBook() throws IOException {

            message = "Введите номер жанра из списка: ";
            System.out.println(message);
            int z = inputValidateYear();
            genre = DataGenre.GENRES.get(z - 1);
            Genre g = new Genre(genre.getName(z - 1));


            message = "Введите номер автора из списка: ";
            System.out.println(message);
            int numb = inputValidateYear();
            author = DataAuthor.AUTHORS.get(numb - 1);
            Author a = new Author(author.getSurname(numb-1), author.getName(numb-1));

            book = new Book(g, a);

            int id = DataBook.COUNT++;
            book.setIdb(id);

            message = "Введите название книги: ";
            System.out.println(message);
            String title = inputValidateName();
            book.setTitle(title);

            message = "Введите краткое описание: ";
            System.out.println(message);
            String description = inputValidateName();
            book.setDescription(description);

            message = "Введите год выпуска: ";
            System.out.println(message);
            int year = inputValidateYear();
            book.setYear(year);
            return book;
        }
    public Book createBookAutor() throws IOException {

        String title = null;
        Book book = new Book(title);

        message = "Введите название книги: ";
        System.out.println(message);
        title = inputValidateName();
        book.setTitle(title);
        return book;
    }
}
