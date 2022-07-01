package homework.Library.controller;

import homework.Library.model.Genre;
import homework.Library.view.ViewGenre;

import java.io.IOException;
import java.util.ArrayList;

public class ControllerGenre {

    Genre genre;

    ViewGenre viewG;

    public ControllerGenre() {
    }

    public Genre createGenre() throws IOException {
        genre = new Genre();
        viewG = new ViewGenre(genre);

            viewG.getInputsGenre();

            return genre;
        }

    public static void printListGenre(ArrayList<Genre> genres) {

        for (Genre genre : genres) {

            System.out.println(genre);

        }
    }
}
