package ClassRoom_Tasks;

final class Book {

    private final String title;
    private final String author;
    private final double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public Book addTax(double taxPercentage) {
        if (taxPercentage < 0) {
            throw new IllegalArgumentException("Tax percentage must not be negative");
        }
        return new Book(title, author, price + (price * taxPercentage / 100));
    }
}

public class ClassRoom_Task19_ImmutableBook {

    public static void main(String[] args) {

        Book b1 = new Book("Effective Java", "Joshua Bloch", 500);

        Book b2 = b1.addTax(18);

        System.out.println("Original Price: " + b1.getPrice());
        System.out.println("New Price: " + b2.getPrice());
    }
}
