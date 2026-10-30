package ClassRoom_Tasks;

final class Product {

    private final String productId;
    private final String name;
    private final double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Product applyDiscount(double percentage) {
        if (percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException("Percentage must be between 0 and 100");
        }
        return new Product(productId, name, price - (price * percentage / 100));
    }
}

public class ClassRoom_Task16_ImmutableProduct {

    public static void main(String[] args) {

        Product p1 = new Product("P1", "Laptop", 1000);

        Product p2 = p1.applyDiscount(10);

        System.out.println("Original Price: " + p1.getPrice());
        System.out.println("Discounted Price: " + p2.getPrice());
    }
}
