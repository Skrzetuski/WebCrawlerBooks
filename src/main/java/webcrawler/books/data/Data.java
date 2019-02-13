package webcrawler.books.data;

import webcrawler.books.book.Book;

import java.util.ArrayList;
import java.util.List;

public class Data {

    private static Data instance;

    private List<Book> wantedBooks = new ArrayList<>();
    private List<Book> ownedBooks = new ArrayList<>();

    private Data() {
    }

    public static Data getInstance() {
        if (instance == null) {
            instance = new Data();
        }
        return instance;
    }

    public List<Book> getWantedBooks() {
        return wantedBooks;
    }

    public List<Book> getOwnedBooks() {
        return ownedBooks;
    }
}
