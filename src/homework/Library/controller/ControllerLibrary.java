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
    Genre genre;
    ControllerAuthor controllerA;
    Author author;
    ConrtollerBook conrtollerB;
    ArrayList<Book> books;

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
                3 - создать список книг.\s""");

        int numb = inputValidateNumber();
        switch (numb) {
            case 1 -> {
                controllerG = new ControllerGenre();
                genre = controllerG.createGenre();
                System.out.println(genre);
            }
            case 2 -> {
                controllerA = new ControllerAuthor();
                author = controllerA.createAuthor();
                System.out.println(author);
            }
            case 3 -> {
                System.out.println("Добавить книгу: ");
                System.out.println();
                conrtollerB = new ConrtollerBook();
                books = conrtollerB.createBookList();
                ConrtollerBook.printBook(books);
            }
            default -> throw new IllegalArgumentException("Unknown chess item name " + numb);
        }
    }
}
