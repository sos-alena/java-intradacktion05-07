package homework.Library.database;

import homework.Library.model.Genre;

import java.util.ArrayList;
public class DataGenre {
    public static ArrayList<Genre> GENRES = new ArrayList<>();
    public static int COUNT = 1;
    public ArrayList<Genre> DataBaseGenre() {

        GENRES.add(new Genre(COUNT++, "Детектив", """
                жанр, описывающий процесс
                исследования загадочного происшествия.
                """));

        GENRES.add(new Genre(COUNT++, "Фантастика", """
                жанр характеризуемый использованием\s
                фантастического допущения
                """));

        GENRES.add(new Genre(COUNT++, "Приключения", """
                захватывающее происшествие
                неожиданное событие или случай в жизни
                """));

        GENRES.add(new Genre(COUNT++, "Роман", "вид эпической литературы, " +
                "изображающий жизнь персонажа" +
                " с её волнующими страстями" + "\n"));

        GENRES.add(new Genre(COUNT++, "Научная книга", """
                совокупность письменных трудов, которые созданы\s
                в результате исследований, теоретических обобщений,
                """));
        return GENRES;
    }
}



