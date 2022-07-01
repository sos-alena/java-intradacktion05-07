package homework.Library.controller;

import homework.Library.model.Author;
import homework.Library.model.Book;
import homework.Library.model.Genre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static homework.Library.Validation.inputValidateNumber;

public class ControllerLibrary {

    ControllerGenre controllerG;
    ControllerAuthor controllerA;
    ConrtollerBook conrtollerB;

    ArrayList<Author> authors;
    ArrayList<Book> books;
    ArrayList<Genre> genres;

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public void listAction() throws IOException {
        do {
            chooseAction();
            System.out.println("Нажмите ENTER что бы продолжить, введите <stop> для завершения");
        }
        while (!READER.readLine().equalsIgnoreCase("stop"));

    }
    public void chooseAction() throws IOException {
        System.out.println("""
                Выберите действие (введите соотвтетствующую цифру):
                1 - создать жанр.\s
                2 - создать автора.\s
                3 - создать список книг.\s
                4 - удалить жанр.\s
                5 - удалить автора.\s
                6 - удалить книгу.\s""");


        int numb = inputValidateNumber();
        switch (numb) {
            case 1 -> {
                controllerG = new ControllerGenre();
                genres = controllerG.createGenre();
                ControllerGenre.printListGenre(genres);
            }
            case 2 -> {
                controllerA = new ControllerAuthor();
                authors = controllerA.createAuthor();
                ControllerAuthor.printListAuthor(authors);
            }
            case 3 -> {
                conrtollerB = new ConrtollerBook();
                books = conrtollerB.createBookList();
                ConrtollerBook.printBook(books);

            }
            case 4 -> {
                controllerG.deleteGenre();
                ControllerGenre.printListGenre(genres);
            }
            case 5 -> {
                controllerA.deleteAuthor();
                ControllerAuthor.printListAuthor(authors);
            }
            case 6 -> {
                conrtollerB.deleteBook();
                ConrtollerBook.printBook(books);
            }

            default -> throw new IllegalArgumentException("Unknown chess item name " + numb);
        }
    }
}
