package homework.Library.controller;

import homework.Library.model.Author;
import homework.Library.model.Book;
import homework.Library.view.ViewAuthor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ControllerAuthor {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    Author author;
    Book book;
    ViewAuthor viewA;
    ArrayList<Author> authors = new ArrayList<>();

    public ArrayList<Author> createAuthor() throws IOException {

        do {
            author = new Author();
            viewA = new ViewAuthor(author);
            authors.add(author);

            viewA.getInputsGenre();
            System.out.println("Нажмите ENTER что бы продолжить, введите <stop> для завершения");

        }
        while (!READER.readLine().equalsIgnoreCase("stop"));
        return authors;
    }
    public void deleteAuthor() throws IOException {

            System.out.println("Введите номер строки которую желаете удалить удалить");
            int x = Integer.parseInt(READER.readLine());
            authors.remove(x-1);
            System.out.println("Нажмите ENTER что бы продолжить, введите <stop> для завершения");
    }

    public static void printListAuthor(ArrayList<Author> authors) {

        for (Author author : authors) {

            System.out.println(author);

        }
    }
}