package webcrawler.books;

import webcrawler.books.book.BookFactor;
import webcrawler.books.book.BookFilter;
import webcrawler.books.book.Printer;
import webcrawler.books.data.Data;
import webcrawler.books.enumData.HeadersEnum;

import java.io.IOException;

public class App {
    private static final String WANTEDBOOKSURL = HeadersEnum.Web.LIBRARY_WANTED.toString();
    private static final String OWNEDBOOKSURL  = HeadersEnum.Web.LIBRARY_OWNED.toString();
    private static final String HEADERS_NAME   = HeadersEnum.Web.HEADERS_NAME.toString();
    private static final String HEADERS_VALUE  = HeadersEnum.Web.HEADERS_VALUE.toString();
    private static final String HTML           = HeadersEnum.Web.HTML.toString();

    public static void main(String[] args) throws IOException {

        String wantedBooks = BookFactor.getJSONObject(WANTEDBOOKSURL, HEADERS_NAME, HEADERS_VALUE, HTML);
        String ownedBooks  = BookFactor.getJSONObject(OWNEDBOOKSURL, HEADERS_NAME, HEADERS_VALUE, HTML);

        Data.getInstance().getWantedBooks().addAll(BookFactor.findBooksInSource(wantedBooks));
        Data.getInstance().getOwnedBooks().addAll(BookFactor.findBooksInSource(ownedBooks));

        BookFilter bookFilter = new BookFilter();

        Printer.printListOfBooks(bookFilter.newListBooksForGift(Data.getInstance().getWantedBooks(),
                Data.getInstance().getOwnedBooks()));
    }
}
