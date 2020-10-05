package app;
import io.DataReader;
import model.Book;

public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.8";

        Book[] books = new Book[1000];
        DataReader dataReader = new DataReader();



/*
        books[1] = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 2010, 296, "Greg",
                "9788373271890");
        books[2] = new Book("Java. Efektywne programowanie. Wydanie II", " Joshua Bloch", 2009,
                352, "Helion", "9788324620845");
        books[3] = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide",
                "Bert Bates, Katherine Sierra", 2008, 851, "McGraw-Hill Osborne Media");
*/
        System.out.println(appName);
        System.out.println("Dodaj nową książkę");
        books[0] = dataReader.readAndCreateBook();
        books[1] = dataReader.readAndCreateBook();
        dataReader.close();

        int counter = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null)
                counter++;
        }
        System.out.println("Liczba książek w bibliotece: " + counter);

        books[0].printInfo();
        books[1].printInfo();
    }
}