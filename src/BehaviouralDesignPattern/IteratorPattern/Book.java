package BehaviouralDesignPattern.IteratorPattern;

public class Book {
    private final int price;
    private final String bookName;

    Book(int price, String bookName) {
        this.price = price;
        this.bookName = bookName;
    }

    public int getPrice() {
        return price;
    }

    public String getBookName() {
        return bookName;
    }
}
