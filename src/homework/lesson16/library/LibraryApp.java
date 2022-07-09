package homework.lesson16.library;

import homework.lesson16.library.controller.LibraryController;

import java.io.IOException;

public class LibraryApp {

    public static void main(String[] args) throws IOException {

        LibraryController libraryController = new LibraryController();
        libraryController.ran();
    }
}