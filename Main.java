import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new HotDrinks("Coffee", 200, 90));
        productList.add(new HotDrinks("Tea", 200, 90));
        HotDrinksVendingMachine vendingMachine = new HotDrinksVendingMachine();
        vendingMachine.initProduct(productList);
        System.out.println(vendingMachine.getProduct("Coffee", 90));
        Product test = new HotDrinks("Coffee", 200, 90);
    }
}