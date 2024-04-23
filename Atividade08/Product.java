public class Product {
    String name;
    double price;

    public String priceTag() {
        return name + " $" + String.format("%.2f", price);
    }
}