package homework.Library;

import homework.Library.controller.ConrtollerBook;
import homework.Library.controller.ControllerAuthor;
import homework.Library.controller.ControllerGenre;
import homework.Library.model.Author;
import homework.Library.model.Book;
import homework.Library.model.Genre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Library {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Список жанров");
        ControllerGenre controllerGenre = new ControllerGenre();
        ArrayList<Genre> genres = controllerGenre.createGenre();
        ControllerGenre.printListGenre(genres);
        controllerGenre.deleteGenre();
        ControllerGenre.printListGenre(genres);

        System.out.println("Список авторов");

        ControllerAuthor controllerAuthor = new ControllerAuthor();
        ArrayList<Author> authors = controllerAuthor.createAuthor();
        ControllerAuthor.printListAuthor(authors);
        controllerAuthor.deleteAuthor();
        ControllerAuthor.printListAuthor(authors);


        System.out.println("Список книг");
        ConrtollerBook controllerBook = new ConrtollerBook();
        ArrayList<Book> books = controllerBook.createBookList();
        ConrtollerBook.printBook(books);
        controllerBook.deleteBook();
        ConrtollerBook.printBook(books);
    }
}

