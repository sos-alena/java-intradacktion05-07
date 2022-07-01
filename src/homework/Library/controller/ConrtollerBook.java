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
    ArrayList<Book> books = new ArrayList<>();
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
    public void deleteBook() throws IOException {

            System.out.println("Введите номер строки которую желаете удалить удалить");
            int x = Integer.parseInt(READER.readLine());
            books.remove(x-1);
            System.out.println("Нажмите ENTER что бы продолжить, введите <stop> для завершения");
    }

    public static void printBook(ArrayList<Book> books) {
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
