package homework.library;
import homework.library.controller.LibraryController;
import java.io.IOException;

public class Library {

    public static void main(String[] args) throws IOException {

        LibraryController libraryController = new LibraryController();
        libraryController.ran();
    }
}