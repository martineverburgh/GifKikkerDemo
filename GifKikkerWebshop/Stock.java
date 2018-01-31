import java.util.HashMap;
import java.util.ArrayList;

public class Stock {
    
    private HashMap<Product, Integer> stockList;
    private ArrayList<Product> productList;
    
    public Stock() {
        stockList = new HashMap();
        productList = new ArrayList();
    }

    public void addProduct(Product product, int amount) {
        stockList.put(product, amount);
        productList.add(product);
    }
    
    public void printStockList() {
        for (Product product : stockList.keySet()) {
            print(product.getDescription());
            print("----------------------");
            print("Prijs: €" + product.getPrice());
            print("Aantal op voorraad: " + stockList.get(product));
            print("Alcoholpercentage: " + product.beer.getAlcoholPercentage() + "% \n");
        }
    }
    
    private void print(String print) {
        System.out.println(print);
    }
    
    public void removeFromStock(Product product, int amount) {
        int currentStock = stockList.get(product);
        currentStock -= amount;
        stockList.replace(product, currentStock);
        print("Product(en) verkocht. \nVoorraad van product aangepast van " + 
            (currentStock + amount) + " naar " + currentStock);
        
    }
    
    public Product searchProduct(String productDescription) {
        for (Product product : productList) {
            if (product.getDescription().equals(productDescription)) {
                return product;
            }
        }
        print("No products found that match your search :(");
        Product p = new Product("Wrong search");
        return p;
    }
}