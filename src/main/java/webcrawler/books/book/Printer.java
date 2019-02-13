package webcrawler.books.book;

import java.util.List;

public class Printer {

    public static void printListOfBooks(List<Book> bookList) {

        for (Book b : bookList) {
            System.out.println(b.getTitle() + " - " + b.getAuthor());
        }
    }
}
