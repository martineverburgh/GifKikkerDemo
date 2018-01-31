import java.util.HashMap;
import java.util.ArrayList;

public class Stock {

    private HashMap<Product, Integer> stockList;
    private ArrayList<Product> productList;

    public Stock() {
        stockList = new HashMap<>();
        productList = new ArrayList<>();
    }

    public void addProduct(Product product, int amount) {
        stockList.put(product, amount);
        productList.add(product);
    }

    public void printStockList() {
        for (Product product : stockList.keySet()) {
            print(product.getDescription());
            print("----------------------");
            print("Sell price: €" + product.getSellPrice());
            print("Amount in stock: " + stockList.get(product));
            print("Alcohol percentage: " + product.beer.getAlcoholPercentage() + "% \n");
        }
    }

    private void print(String print) {
        System.out.println(print);
    }

    public void removeFromStock(Product product, int amount) {
        int currentStock = stockList.get(product);
        if (currentStock - amount >= 0) {
            currentStock -= amount;
            stockList.replace(product, currentStock);
            print(product.getDescription() + " sold. \nStock changed from " + 
                (currentStock + amount) + " to " + currentStock);
        }
        else {
            print("There are only " + currentStock + " of these products in stock.");
        }   

    }

    public Product searchProduct(String productDescription) {
        Product returnProduct = null;
        for (Product product : productList) {
            if (product.getDescription().equals(productDescription)) {
                returnProduct = product;
            }
        }
        if (returnProduct == null) {
            print("No products found that match your search :(");
        }
        return returnProduct;
    }
}