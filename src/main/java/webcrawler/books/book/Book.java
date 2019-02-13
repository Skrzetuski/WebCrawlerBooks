package webcrawler.books.book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book {

    private String title;
    private List<String> author = new ArrayList<>();


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthor() {
        return author;
    }

    public void setAuthor(List<String> author) {
        this.author = author;
    }

    void splitAuthorsToList(String authors) {
        Collections.addAll(author, authors.trim().split("\\s*,\\s*"));
    }

    static boolean checkIsOneAuthor(String text) {
        return !text.matches(".*,.*");
    }

}
