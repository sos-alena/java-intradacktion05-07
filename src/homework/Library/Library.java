package homework.Library;

import homework.Library.controller.ControllerAuthor;
import homework.Library.controller.ControllerGenre;
import homework.Library.controller.ControllerLibrary;
import homework.Library.database.DataAuthor;
import homework.Library.database.DataGenre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Library {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("СПИСОК ЖАНРОВ: ");
        System.out.println();
        ControllerGenre.printListGenre(DataGenre.createDataBaseGenre());

        System.out.println("СПИСОК АВТОРОВ: ");
        System.out.println();
        ControllerAuthor.printListAuthor(DataAuthor.createDataBaseAuthor());


       /* ControllerGenre controllerG = new ControllerGenre();
        Genre genre = controllerG.createGenre();
        genres.add(genre);

        ControllerGenre.printListGenre(genres);

        System.out.println();
        System.out.println("Добавить книгу: ");
        System.out.println();

        ConrtollerBook conrtollerB = new ConrtollerBook();
        ArrayList<Book> books = conrtollerB.createBookList();
        ConrtollerBook.printBook(books);*/

        ControllerLibrary contr = new ControllerLibrary();
        contr.listAction();


    }

}

