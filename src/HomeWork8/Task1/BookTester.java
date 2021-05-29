package HomeWork8.Task1;

import java.util.ArrayList;

public class BookTester {
    public static void main(String[] args) {

        ArrayList<Book> bookCollection = new ArrayList<>();

        bookCollection.add(new Book(10.0, "Book_1", "hard", 100));
        bookCollection.add(new Book(11.0, "Book_2", "hard", 110));
        bookCollection.add(new Book(12.0, "Book_3", "hard", 120));
        bookCollection.add(new Book(13.0, "Book_4", "hard", 130));
        bookCollection.add(new Book(14.0, "Book_5", "hard", 140));
        bookCollection.add(new Book(15.0, "Book_6", "soft", 150));
        bookCollection.add(new Book(16.0, "Book_7", "soft", 160));
        bookCollection.add(new Book(17.0, "Book_8", "soft", 170));
        bookCollection.add(new Book(18.0, "Book_9", "soft", 180));
        bookCollection.add(new Book(19.0, "Book_10", "soft", 190));

        ArrayList<Book> booksWithSoftCover = new ArrayList<>();
        ArrayList<Book> booksWithHardCover = new ArrayList<>();

        for (Book book : bookCollection) {
            if (book.getCoverType().equals("hard")) {
                booksWithHardCover.add(book);
            }
            if (book.getCoverType().equals("soft")) {
                booksWithSoftCover.add(book);
            }
        }

        System.out.println("Книги в мягком переплете:");
        for (Book book : booksWithSoftCover) {
            System.out.println(book.getTitle());
        }
        System.out.println();

        System.out.println("Книги в твердом переплете:");
        for (Book book : booksWithHardCover) {
            System.out.println(book.getTitle());
        }
    }
}
