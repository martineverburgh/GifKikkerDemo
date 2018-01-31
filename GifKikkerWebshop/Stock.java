import java.util.HashMap;

public class Stock {
    
    private HashMap<Product, Integer> stockList;
    
    public Stock() {
        stockList = new HashMap();
    }

    public void addProduct(Product product, int amount) {
        stockList.put(product, amount);
    }
    
    public void printStockList() {
        for (Product product : stockList.keySet()) {
            print(product.getDescription());
            print("Aantal op voorraad: " + stockList.get(product) + "\n");
        }
    }
    
    private void print(String print) {
        System.out.println(print);
    }
}