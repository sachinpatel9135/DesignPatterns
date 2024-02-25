package BehaviouralDesignPattern.IteratorPattern;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Book> bookList =
            Arrays.asList(
                new Book(100, "Science"), new Book(200, "Maths"), new Book(300, "GK"), new Book(400, "Drawing"));
        Library library = new Library(bookList);
        Iterator iterator = library.createIterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getBookName());
        }
    }
}
