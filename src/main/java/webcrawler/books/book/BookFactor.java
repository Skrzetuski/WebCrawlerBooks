package webcrawler.books.book;

import org.json.JSONObject;
import webcrawler.books.crawler.Crawler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BookFactor {

    private final static String PATTERN = "<strong>(.*)</strong><br/>(.*)<br/>";


    public static String getJSONObject(String url, String headers, String value, String key) throws IOException {

        JSONObject object = new JSONObject(Crawler.getBookShelf(url, headers, value));

        return String.valueOf(object.get(key));
    }

    public static List<Book> findBooksInSource(String source) {

        Pattern pattern = Pattern.compile(PATTERN);
        Matcher matcher = pattern.matcher(source);

        List<Book> list = new ArrayList<Book>();

        while (matcher.find()) {

            Book book = new Book();
            book.setTitle(matcher.group(1));
            if (Book.checkIsOneAuthor(matcher.group(2))) {
                book.getAuthor().add(matcher.group(2));

            } else {
                book.splitAuthorsToList(matcher.group(2));
            }

            list.add(book);
        }

        return list;
    }
}
