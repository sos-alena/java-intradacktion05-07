package homework.Library.controller;

import homework.Library.model.Author;
import homework.Library.model.Book;
import homework.Library.view.ViewAuthor;

import java.io.IOException;
import java.util.ArrayList;

public class ControllerAuthor {

Author author;
Book book;
    ViewAuthor viewA;

    public Author createAuthor() throws IOException {
        author = new Author();
        viewA = new ViewAuthor(author);

        viewA.getInputsGenre();

        return author;
    }

    public static void printListAuthor(ArrayList<Author> authors) {

        for (Author author : authors) {

            System.out.println(author);

        }
    }
}