package homework.Library.view;

import homework.Library.database.DataAuthor;
import homework.Library.database.DataGenre;
import homework.Library.model.Author;
import homework.Library.model.Book;
import homework.Library.model.Genre;

import java.io.IOException;
import java.util.ArrayList;

import static homework.Library.Validation.*;

public class ViewBook {


    Book book;
    String message;
    Author author;
    Genre genre;
    ArrayList<Genre> genres = DataGenre.createDataBaseGenre();
    ArrayList<Author> authors = DataAuthor.createDataBaseAuthor();

        public Book createBook() throws IOException {

            message = "Введите номер жанра из списка: ";
            System.out.println(message);
            int z = inputValidateYear();
            genre = genres.get(z - 1);

            message = "Введите номер автора из списка: ";
            System.out.println(message);
            int numb = inputValidateYear();
            author = authors.get(numb - 1);

            book = new Book(genre, author);

            message = "Введитe номер по порядку: ";
            System.out.println(message);
            int idb = inputValidateNumber();
            book.setIdb(idb);

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
}
