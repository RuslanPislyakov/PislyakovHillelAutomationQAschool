package HomeWork9;

import HomeWork8.Task1.Book;

import java.util.ArrayList;

/*
2. В класса main cоздать ArrayList - потом наполнить его 5 элементами Book из
предидущего урока. После этого попытаться достучаться до элемента с
индексом 5. Обработать эксепшен в try - catch.
 */
public class FiveBooks {

    public static void main(String[] args) {

        ArrayList<Book> booksList = new ArrayList<>();

        booksList.add(new Book(11.0, "Book_1", "hard", 110));
        booksList.add(new Book(12.0, "Book_2", "hard", 120));
        booksList.add(new Book(13.0, "Book_3", "hard", 130));
        booksList.add(new Book(14.0, "Book_4", "soft", 140));
        booksList.add(new Book(15.0, "Book_5", "soft", 150));

        try {
            System.out.println(booksList.get(5).getTitle());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds!");
        }
    }
}
