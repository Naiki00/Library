package data;

import model.Book;

public class Library {

    private final int maxBooksNum = 1000;
    private Book[] books = new Book[maxBooksNum];
    private int currentBooksNum;

    public void addBook(Book book) {
        if (currentBooksNum < maxBooksNum ) {
            books[currentBooksNum] = book;
            currentBooksNum++;
            System.out.println("Książka dodana.");
        } else {
            System.out.println("Biblioteka pełna!");
        }
    }

    public void printBooks() {
        if (currentBooksNum == 0) {
            System.out.println("Brak książek w bibliotece!");
        } else {
            for (int i = 0; i < currentBooksNum; i++) {
                books[i].printInfo();
            }
        }
    }
}
