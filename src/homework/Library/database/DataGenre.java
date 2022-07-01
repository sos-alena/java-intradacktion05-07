package homework.Library.database;

import homework.Library.model.Genre;

import java.util.ArrayList;

public class DataGenre {

    public static ArrayList<Genre> createDataBaseGenre() {

        ArrayList<Genre> genres = new ArrayList<>();
        Genre g = new Genre();
        g.setId(1);
        g.setName("Детектив");
        g.setDescription("""
                жанр, описывающий процесс
                исследования загадочного происшествия.
                """);
        genres.add(g);

        Genre g2 = new Genre();
        g2.setId(2);
        g2.setName("Фантастика");
        g2.setDescription("""
                жанр характеризуемый использованием\s
                фантастического допущения
                """);
        genres.add(g2);

        Genre g3 = new Genre();
        g3.setId(3);
        g3.setName("Приключения");
        g3.setDescription("""
                захватывающее происшествие
                неожиданное событие или случай в жизни
                """);
        genres.add(g3);

        Genre g4 = new Genre();
        g4.setId(4);
        g4.setName("Роман");
        g4.setDescription("вид эпической литературы, изображающий жизнь персонажа" +
                " с её волнующими страстями" + "\n");
        genres.add(g4);

        Genre g5 = new Genre();
        g5.setId(5);
        g5.setName("Научная книга");
        g5.setDescription("""
                совокупность письменных трудов, которые созданы\s
                в результате исследований, теоретических обобщений,
                """);
        genres.add(g5);

        return genres;
    }

}



