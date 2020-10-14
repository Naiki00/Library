package io;

import model.Book;
import java.util.Scanner;

public class DataReader {
    private Scanner scanner = new Scanner(System.in); //obiekt

    public void close() {
        scanner.close();
    }

    public int getInt() { //do odczytania wyboru opcji użytkownika
        int numInt = scanner.nextInt();
        scanner.nextLine();
        return numInt;
    }

    public Book readAndCreateBook() {
        System.out.println("Tytuł: ");
        String title = scanner.nextLine();
        System.out.println("Autor: ");
        String author = scanner.nextLine();
        System.out.println("Rok wydania: ");
        int releaseDate = getInt();
        System.out.println("Liczba stron: ");
        int pages = getInt();
        System.out.println("Wydawnictwo: ");
        String publisher = scanner.nextLine();
        System.out.println("ISBN: ");
        String isbn = scanner.nextLine();

        return new Book(title, author, releaseDate, pages, publisher, isbn);
    }

}
