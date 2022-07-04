package homework.Library.controller;

import homework.Library.Utils;
import homework.Library.database.DataGenre;
import homework.Library.model.Genre;
import homework.Library.view.ViewGenre;

import java.io.IOException;
import java.util.ArrayList;

import static homework.Library.Validation.inputValidateName;

public class ControllerGenre {

    public Genre genre;
    public ViewGenre viewG;

    public boolean findGenre() throws IOException {

        System.out.println("Поиск жанра по названию. ");
        System.out.println("---------------------------");
        System.out.println("Введите название жанра: ");

        String str = inputValidateName();
        for (Genre g : DataGenre.GENRES) {
            if (str.equalsIgnoreCase(g.getName())) {
                System.out.println("Жанр есть в списке" + g);
                return true;
            }
        }
        System.out.println("Элемент не найден. Создайте новый жанр.");
        return false;
    }
    public ArrayList<Genre> createGenre() throws IOException {
        if (!findGenre()) {
            do {
                genre = new Genre();
                viewG = new ViewGenre(genre);

                viewG.getInputsGenre();
                DataGenre.GENRES.add(genre);

                System.out.println("Нажмите ENTER для создания следующего жанра или <stop> для завершения");
            }
            while (!Utils.READER.readLine().equalsIgnoreCase("stop"));
        }
        printListGenre(DataGenre.GENRES);
        return DataGenre.GENRES;
    }
    public void deleteGenre() throws IOException {

        System.out.println("Введите номер строки которую желаете удалить удалить");
        int x = Integer.parseInt(inputValidateName());
        DataGenre.GENRES.remove(x - 1);
        printListGenre(DataGenre.GENRES);
    }

    public void printListGenre(ArrayList<Genre> genres) {
        System.out.println("-----------------------------------------------------");
        System.out.println("СПИСОК ЖАНРОВ: ");
        System.out.println("------------------------------------------------------");
        for (Genre genre : genres) {
            System.out.println(genre);
        }
    }
}
