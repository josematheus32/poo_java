import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ImportedProduct extends Product {
    double customsFee;

    public ImportedProduct(String name, double price, double customsFee) {
        this.name = name;
        this.price = price;
        this.customsFee = customsFee;
    }

    public String priceTag() {
        return super.priceTag() + " (Customs fee: $ " + String.format("%.2f", customsFee) + ")";
    }

    public double totalPrice() {
        return price + customsFee;
    }
}