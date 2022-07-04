package homework.Library.view;

import homework.Library.database.DataAuthor;
import homework.Library.model.Author;

import java.io.IOException;

import static homework.Library.Validation.inputValidateName;
public class ViewAuthor {

    String title;
    Author author;
    public ViewAuthor(Author author) {
        this.author = author;
    }
    public void getInputsGenre() throws IOException {

        int id = DataAuthor.COUNT++;
        author.setNumb(id);

        title = "Введитe фамилию автора: ";
        System.out.println(title);
        String surname = inputValidateName();
        author.setSurname(surname);

        title = "Введитe имя автора: ";
        System.out.println(title);
        String name = inputValidateName();
        author.setName(name);

    }
}


