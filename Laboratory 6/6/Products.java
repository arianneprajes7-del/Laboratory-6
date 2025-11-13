import java.util.*;
import java.util.stream.*;

class Product {
    String name;
    double price;

    Product(String n, double p) {
        name = n;
        price = p;
    }
}
public class Products {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product("Laptop", 80));
        list.add(new Product("Mouse", 25));
        list.add(new Product("Keyboard", 45));
        list.add(new Product("Monitor", 120));
        list.add(new Product("USB", 15));

        Scanner input = new Scanner(System.in);
        System.out.print("Enter price limit: ");
        double limit = input.nextDouble();

        long count = list.stream().filter(p -> p.price > limit).count();
        System.out.println("Products above " + limit + ": " + count);
    }
}