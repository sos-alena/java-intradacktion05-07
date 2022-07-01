package homework.Library.view;

import homework.Library.model.Author;
import homework.Library.model.Book;

import java.io.IOException;

import static homework.Library.Validation.*;
public class ViewAuthor {

    String title;
    Author author;

    Book book;

    public ViewAuthor(Author author) {
        this.author = author;
    }
    public void getInputsGenre() throws IOException {


        title = "Введитe номер по порядку: ";
        System.out.println(title);
        int numb = inputValidateNumber();
        author.setNumb(numb);

        title = "Введитe фамилию автора: ";
        System.out.println(title);
        String surname = inputValidateName();
        author.setSurname(surname);

        title = "Введитe имя автора: ";
        System.out.println(title);
        String name = inputValidateName();
        author.setName(name);

    }

    public void getOutputGenre(String output) {
        System.out.println(output);
    }
}


