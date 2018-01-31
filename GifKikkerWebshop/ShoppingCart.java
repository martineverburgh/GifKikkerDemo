import java.util.HashMap;

public class ShoppingCart {

    private HashMap<Product, Integer> productsInCart;
    private Stock stock;

    public ShoppingCart(Stock stock) {
        this.stock = stock;
        productsInCart = new HashMap<>();
    }

    public void addToCart(Product product, int amount) {
        productsInCart.put(product, amount);
    }

    public void showProductsInCart(){
    }
    
    public void productsSold(){
        for (Product product : productsInCart.keySet()) {
            stock.removeFromStock(product, productsInCart.get(product));
        }
    }
}