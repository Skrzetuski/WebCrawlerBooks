package webcrawler.books.book;

import java.util.ArrayList;
import java.util.List;

public class BookFilter {
    public List<Book> newListBooksForGift(List<Book> listBooksWanted, List<Book> listBooksOwned) {

        List<Book> newList = new ArrayList<>();

        Boolean flag = false;

        for (Book bookWanted : listBooksWanted) {

            for (Book bookOwned : listBooksOwned) {

                if (bookOwned.getTitle().equals(bookWanted.getTitle())) {
                    flag = true;
                }
            }

            if (!flag) {
                newList.add(bookWanted);
            }

            flag = false;
        }

        return newList;
    }

}
