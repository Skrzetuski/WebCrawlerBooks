package webcrawler.books.book;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookTest {

    String TEXT ="Stephen King, Peter David, Richard Isanove, Jae Lee, Robin Furth";



    @Test
    public void checkIsOneAuthor(){
        org.junit.Assert.assertEquals(!TEXT.matches(".*,.*"),false);
    }

    @Test
    public void splitAuthorsToList(){
        List<String> author = new ArrayList<String>();
        Collections.addAll(author, TEXT.trim().split("\\s*,\\s*"));
        Assert.assertEquals("Stephen King",author.get(0));
        Assert.assertEquals("Peter David",author.get(1));
        Assert.assertEquals("Richard Isanove",author.get(2));
        Assert.assertEquals("Jae Lee",author.get(3));
        Assert.assertEquals("Robin Furth",author.get(4));
        Assert.assertEquals(5,author.size());
    }

    @Test
    public void equalsBook(){
        Book bookOne = new Book();
        bookOne.setTitle("Ogniem i mieczem");
        bookOne.getAuthor().add("Zbigniew Herbert");
        bookOne.getAuthor().add("Sienkiewicz");

        Book bookTwo = new Book();
        bookTwo.setTitle("Ogniem i mieczem");
        bookTwo.getAuthor().add("Zbigniew Herbert");
        bookTwo.getAuthor().add("Sienkiewicz");

        Assert.assertNotEquals(bookTwo, bookOne);
        Assert.assertEquals(bookTwo.getTitle(), bookOne.getTitle());
        Assert.assertEquals(bookTwo.getAuthor(), bookOne.getAuthor());

    }

}