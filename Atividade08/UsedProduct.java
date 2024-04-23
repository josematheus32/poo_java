import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
    LocalDate manufactureDate;

    public UsedProduct(String name, double price, LocalDate manufactureDate) {
        this.name = name;
        this.price = price;
        this.manufactureDate = manufactureDate;
    }

    public String priceTag() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return super.priceTag() + " (Manufacture date: " + manufactureDate.format(formatter) + ")";
    }
}