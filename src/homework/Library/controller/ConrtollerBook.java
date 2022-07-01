package homework.Library.controller;

import homework.Library.model.Book;
import homework.Library.view.ViewBook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ConrtollerBook {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    Book book;
    ViewBook viewB;

    public ConrtollerBook() {
    }

    public ArrayList<Book> createBookList() throws IOException {
        ArrayList<Book> books = new ArrayList<>();
        do {
            viewB = new ViewBook();
            book = viewB.createBook();

            books.add(book);
            System.out.println("Нажмите ENTER что бы продолжить, введите <stop> для завершения");
        }
        while (!READER.readLine().equalsIgnoreCase("stop"));
        return books;
    }

    public static void printBook(ArrayList<Book> books) {
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
