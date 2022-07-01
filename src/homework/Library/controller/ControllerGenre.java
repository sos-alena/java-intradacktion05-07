package homework.Library.controller;

import homework.Library.model.Genre;
import homework.Library.view.ViewGenre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class ControllerGenre {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    Genre genre;
    ViewGenre viewG;
    ArrayList<Genre> genres = new ArrayList<>();

    public ControllerGenre() {
    }

    public ArrayList<Genre> createGenre() throws IOException {

        do {
            genre = new Genre();
            viewG = new ViewGenre(genre);
            genres.add(genre);

            viewG.getInputsGenre();
            System.out.println("Нажмите ENTER что бы продолжить, введите <stop> для завершения");
        }
        while (!READER.readLine().equalsIgnoreCase("stop"));
        return genres;
    }

    public void deleteGenre() throws IOException {

        do {
            System.out.println("Введите номер строки которую желаете удалить удалить");
            int x = Integer.parseInt(READER.readLine());
            genres.remove(x-1);
            System.out.println("Нажмите ENTER что бы продолжить, введите <stop> для завершения");
        }
        while (!READER.readLine().equalsIgnoreCase("stop"));
    }

    public static void printListGenre(ArrayList<Genre> genres) {

        for (Genre genre : genres) {
            System.out.println(genre);
        }
    }
}
