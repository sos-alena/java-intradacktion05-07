package homework.Library.controller;

import homework.Library.Utils;
import homework.Library.database.DataAuthor;
import homework.Library.database.DataBook;
import homework.Library.database.DataGenre;
import homework.Library.model.Author;
import homework.Library.model.Book;
import homework.Library.model.Genre;

import java.io.IOException;
import java.util.ArrayList;

import static homework.Library.Validation.inputValidateName;
import static homework.Library.Validation.inputValidateNumber;
import static homework.Library.controller.TypeAction.Type;

public class ControllerLibrary {

    ControllerGenre controllerG;
    ControllerAuthor controllerA;
    ControllerBook conrtollerB;

    ArrayList<Genre> genres;
    ArrayList<Author> authors;

    ArrayList<Book> books;
    DataGenre dg;
    DataAuthor da;
    DataBook db;
    Type type;
    String str;


    public void chooseActionAuthor() throws IOException {

        da = new DataAuthor();
        authors = da.DataBaseAuthor();
        controllerA = new ControllerAuthor();
        controllerA.printListAuthor(authors);
        System.out.println("_________________________________________");
        do {
            System.out.println("choose FIND; " +
                    " choose CREATE; " +
                    " choose DELETE; " +
                    " choose PRINT_ALL;");
            str = input();
            type = Type.valueOf(str);
            switch (type) {
                case FIND -> controllerA.findAuthor();
                case CREATE -> controllerA.createAuthor();
                case DELETE -> controllerA.deleteAuthor();
                case PRINT_ALL -> controllerA.printListAuthor(authors);
                default -> throw new IllegalStateException("Unexpected value: " + type);
            }
            System.out.println("Нажмите ENTER что бы продолжить выбор действий (FIND, CREATE, DELETE, PRINT_ALL), введите <stop> для завершения");
        }
        while (!Utils.READER.readLine().equalsIgnoreCase("STOP"));
    }

    public void chooseActionGenre() throws IOException {

        dg = new DataGenre();
        genres = dg.DataBaseGenre();
        controllerG = new ControllerGenre();
        controllerG.printListGenre(genres);
        System.out.println("_______________________________________");
        do {
            System.out.println("choose FIND; " +
                    " choose CREATE; " +
                    " choose DELETE; " +
                    " choose PRINT_ALL;");
            str = input();
            type = Type.valueOf(str);
            switch (type) {
                case FIND -> controllerG.findGenre();
                case CREATE -> controllerG.createGenre();
                case DELETE -> controllerG.deleteGenre();
                case PRINT_ALL -> controllerG.printListGenre(genres);
                default -> throw new IllegalStateException("Unexpected value: " + type);
            }
            System.out.println("Нажмите ENTER что бы продолжить выбор действий (FIND, CREATE, DELETE, PRINT_ALL), введите <stop> для завершения");
        }
        while (!Utils.READER.readLine().equalsIgnoreCase("STOP"));
    }
    public void chooseActionBook() throws IOException {
        dg = new DataGenre();
        da = new DataAuthor();
        db = new DataBook();
        books = db.DataBaseBook();
        authors = da.DataBaseAuthor();
        genres = dg.DataBaseGenre();
        controllerA = new ControllerAuthor();
        controllerA.printListAuthor(authors);
        controllerG = new ControllerGenre();
        controllerG.printListGenre(genres);
        conrtollerB = new ControllerBook();
        conrtollerB.printBook(books);

        System.out.println("_______________________________________");
        do {
            System.out.println("choose FIND; " +
                    " choose CREATE; " +
                    " choose DELETE; " +
                    " choose PRINT_ALL;");
            str = input();
            type = Type.valueOf(str);
            switch (type) {
                case FIND -> conrtollerB.findBook();
                case CREATE -> conrtollerB.createBookList();
                case DELETE -> conrtollerB.deleteBook();
                case PRINT_ALL -> conrtollerB.printBook(books);
                default -> throw new IllegalStateException("Unexpected value: " + type);
            }
            System.out.println("Нажмите ENTER что бы продолжить выбор действий (FIND, CREATE, DELETE, PRINT_ALL), введите <stop> для завершения");
        }
        while (!Utils.READER.readLine().equalsIgnoreCase("STOP"));
    }
    public static String input() throws IOException {
        String str;
        if (((str=inputValidateName()).equals("FIND")) ||
                (str.equals("CREATE")) ||
                (str.equals("DELETE")) ||
                (str.equals("PRINT_ALL")) ||
                (str.equals("STOP"))) {
            return str;
        }
        System.out.println("Error: ");
        System.out.println("Enter value again");
        return input();
    }

    public void appLibrary() throws IOException {
        do {
            System.out.println("введите 1 для выбора - КНИГА; " +
                    " введите 2 для выбора - АВТОР; " +
                    " введите 3 для выбора - ЖАНР ");

            int numb = inputValidateNumber();
            switch (numb) {
                case 1 -> chooseActionBook();
                case 2 -> chooseActionAuthor();
                case 3 -> chooseActionGenre();
            }
            System.out.println("Нажмите ENTER что бы продолжить выбор (Жанр, Автор, Книга), введите <stop> для завершения");

        } while (!Utils.READER.readLine().equalsIgnoreCase("stop"));
    }
}
