import java.util.HashMap;

public class Stock {
    
    private HashMap<Product, Integer> stockList;
    
    public Stock() {
        stockList = new HashMap();
    }

    public void addProduct(Product product, int amount) {
        stockList.put(product, amount);
    }
}