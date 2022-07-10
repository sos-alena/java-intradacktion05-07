package homework.lesson16.library.controller;

import homework.lesson16.library.database.AuthorData;
import homework.lesson16.library.database.BookData;
import homework.lesson16.library.database.GenreData;
import homework.lesson16.library.model.Author;
import homework.lesson16.library.model.Book;
import homework.lesson16.library.model.Genre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static homework.lesson16.library.Validation.inputValidateStr;

public class LibraryController {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private final ArrayList<Author> authors = AuthorData.authorDataBase();
    private final ArrayList<Genre> genres = GenreData.genreDataBase();
    private final ArrayList<Book> books = BookData.bookDataBase();
    private Type type;
    private Item item;

    public void ran() throws IOException {
        System.out.println("Нажмите ENTER для начала работы с программой " +
                "или STOP для ее завершения");
        while (!READER.readLine().equalsIgnoreCase("STOP")) {
            itemLibrary();
        }
    }
    public void itemLibrary() throws IOException {

            System.out.println("input AUTHOR; " +
                    " choose GENRE; " +
                    " choose BOOK; ");
           item = inputItem();
        switch (item) {
            case AUTHOR -> authorChooseAction();
            case GENRE -> genreChoose();
            case BOOK -> bookChoose();
        }
    }

    public void authorChooseAction() throws IOException {
        AuthorController authorController = new AuthorController(authors);
        System.out.println("choose FIND; " +
                " choose CREATE; " +
                " choose DELETE; " +
                " choose PRINT_ALL;" +
                " choose EXIT");
        switch (type = inputType()) {
            case FIND -> authorController.authorFind();
            case CREATE -> authorController.authorCreate();
            case DELETE -> authorController.authorDelete();
            case PRINT_ALL -> authorController.authorPrintList();
            case EXIT -> ran();

        } System.out.println("Для продолжения нажмите ENTER или STOP для завершения программы.");
    }

    public void genreChoose() throws IOException {
        GenreController genreController = new GenreController(genres);
        System.out.println("choose FIND; " +
                " choose CREATE; " +
                " choose DELETE; " +
                " choose PRINT_ALL;" +
                " choose EXIT");
        type = inputType();
        switch (type) {
            case FIND -> genreController.genreFind();
            case CREATE -> genreController.genreCreate();
            case DELETE -> genreController.genreDelete();
            case PRINT_ALL -> genreController.genrePrintList();
            case EXIT -> ran();
        } System.out.println("Для продолжения нажмите ENTER или STOP для завершения программы.");
    }
    public void bookChoose() throws IOException {
        BookController bookController = new BookController(books);
        new GenreController(genres);
        new AuthorController(authors);

        System.out.println("choose FIND; " +
                " choose CREATE; " +
                " choose DELETE; " +
                " choose PRINT_ALL;" +
                " choose EXIT");
        type = inputType();
        switch (type) {
            case FIND -> bookController.bookFind();
            case CREATE -> bookController.bookCreate(genres, authors);
            case DELETE -> bookController.bookDelete();
            case PRINT_ALL -> bookController.bookPrint();
            case EXIT -> ran();
        } System.out.println("Для продолжения нажмите ENTER или STOP для завершения программы.");
    }

    public static Type inputType() {
        try {
            String str = inputValidateStr().toUpperCase();
            return Type.valueOf(str);
        } catch (Exception exception) {
            System.out.println("Неверное значение типа: " + exception.getMessage());
            System.out.println("Введите значение снова: ");
            return inputType();
        }
    }

    public static Item inputItem() {
        try {
            String str = inputValidateStr();
            return Item.valueOf(str);
        } catch (Exception exception) {
            System.out.println("Неверное значение типа: " + exception.getMessage());
            System.out.println("Введите значение снова: ");
            return inputItem();
        }
    }
}


