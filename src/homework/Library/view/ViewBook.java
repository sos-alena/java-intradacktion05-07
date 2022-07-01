package homework.Library.view;

import homework.Library.database.DataAuthor;
import homework.Library.database.DataGenre;
import homework.Library.model.Author;
import homework.Library.model.Book;
import homework.Library.model.Genre;

import java.io.IOException;
import java.util.ArrayList;

import static homework.Library.Validation.inputValidateName;
import static homework.Library.Validation.inputValidateYear;

public class ViewBook {


    Book book;
    String message;
    Author author;
    Genre genre;
    ArrayList<Genre> genres = DataGenre.createDataBaseGenre();
    ArrayList<Author> authors = DataAuthor.createDataBaseAuthor();

        public Book createBook() throws IOException {

                message = "Введите номер жанра: ";
                System.out.println(message);
                int id = inputValidateYear();
                genre = genres.get(id - 1);

                message = "Введите номер автора из списка: ";
                System.out.println(message);
                int numb = inputValidateYear();
                author = authors.get(numb - 1);

                book = new Book(genre, author);

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
