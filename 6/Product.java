public class Product implements Priceable {
    private String name;
    private float price;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product '" + this.name + "' costs: " + getPrice();
    }
}