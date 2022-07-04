package homework.Library.view;

import homework.Library.database.DataGenre;
import homework.Library.model.Genre;

import java.io.IOException;

import static homework.Library.Validation.inputValidateName;

public class ViewGenre {

    protected String title;
    protected Genre genre;
    public ViewGenre(Genre genre) {
        this.genre = genre;
    }
    public void getInputsGenre() throws IOException {

        int id = DataGenre.COUNT++;
        genre.setId(id);

        title = "Введитe название жанра: ";
        System.out.println(title);
        String name = inputValidateName();
        genre.setName(name);

        title = "Введите краткое описание: ";
        System.out.println(title);
        String description = inputValidateName();
        genre.setDescription(description);
    }
}