import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nProduct #" + (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            String type = scanner.next();

            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("Price: ");
            double price = scanner.nextDouble();

            if (type.equalsIgnoreCase("i")) {
                System.out.print("Customs fee: ");
                double customsFee = scanner.nextDouble();
                products[i] = new ImportedProduct(name, price, customsFee);
            } else if (type.equalsIgnoreCase("u")) {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                int day = scanner.nextInt();
                int month = scanner.nextInt();
                int year = scanner.nextInt();
                products[i] = new UsedProduct(name, price, LocalDate.of(year, month, day));
            } else {
                products[i] = new Product();
                products[i].name = name;
                products[i].price = price;
            }
        }

        System.out.println("\nPRICE TAGS:");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }
    }
}