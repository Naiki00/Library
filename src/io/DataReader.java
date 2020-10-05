package io;

import model.Book;
import java.util.Scanner;

public class DataReader {
    private Scanner scanner = new Scanner(System.in); //obiekt

    public void close() {
        scanner.close();
    }

    public Book readAndCreateBook() {
        System.out.println("Tytuł: ");
        String title = scanner.nextLine();
        System.out.println("Autor: ");
        String author = scanner.nextLine();
        System.out.println("Rok wydania: ");
        int releaseDate = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Liczba stron: ");
        int pages = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = scanner.nextLine();
        System.out.println("ISBN: ");
        String isbn = scanner.nextLine();

        return new Book(title, author, releaseDate, pages, publisher, isbn);
    }
}
