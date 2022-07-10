package homework.lesson16.library.controller;

import homework.lesson16.library.database.GenreData;
import homework.lesson16.library.model.Genre;

import java.io.IOException;
import java.util.ArrayList;

import static homework.lesson16.library.Validation.inputValidateNumber;
import static homework.lesson16.library.Validation.inputValidateStr;

public class GenreController {
    private Genre genre;
    private ArrayList<Genre> genres;

    public GenreController(ArrayList<Genre> genres) {
        this.genres = genres;
    }
    public Genre genreFind() throws IOException {

        System.out.println("Поиск жанра по названию. ");
        System.out.println("---------------------------");
        System.out.println("Введите название жанра: ");

        String str = inputValidateStr();
        for (Genre genre : genres) {
            if (str.equalsIgnoreCase(genre.getName())) {
                System.out.println("Жанр есть в списке" + genre);
                return genre;
            }
        }
        System.out.println("Элемент не найден. Создайте новый жанр.");
        return null;
    }
    public void genreCreate() throws IOException {

        genre = new Genre();

        int id = GenreData.COUNT++;
        genre.setId(id);

        System.out.println("Введитe название жанра: ");
        String name = inputValidateStr();
        genre.setName(name);

        System.out.println("Введите краткое описание: ");
        String description = inputValidateStr();
        genre.setDescription(description);
        genres.add(genre);
        System.out.println(genre);

    }
    public void genreDelete(){

        System.out.println("Введите номер строки которую желаете удалить удалить");
        int x = inputValidateNumber(0, genres.size());
        genres.remove(x - 1);
        System.out.println("Строка - " + x + " удалена!");
        genrePrintList();
    }
    public void genrePrintList() {
        System.out.println("-----------------------------------------------------");
        System.out.println("СПИСОК ЖАНРОВ: ");
        System.out.println("------------------------------------------------------");
        for (Genre genre : genres) {
            System.out.println(genre);
        }
    }
}
