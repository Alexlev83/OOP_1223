
import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine{
    private List<Product> productList = new ArrayList<>();
    @Override
    public void initProduct(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList)
            if(product.getName().equals(name))
                return product;
        return null;
    }

    
    public Product getProduct(String name, int temperature){
        for (Product item : productList)
            if(item.getName().equals(name) && ((HotDrinks) item).temperature() == temperature)
                return item;
        return null;
    }

    public Product getProduct(int  temperature){
        for (Product item : productList)
            if(((HotDrinks) item).gettemperature() ==  temperature)
                return item;
        return null;
    }
}