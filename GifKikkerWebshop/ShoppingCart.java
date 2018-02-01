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
        System.out.println(amount + " time(s) " + product.getDescription() + 
            " is added to your Shopping Cart.");
    }

    public void showProductsInCart(){
        double totalPrice = 0;
        System.out.println("Your Shopping Cart contains:");
        for (Product product : productsInCart.keySet()) {
            System.out.println("Product: " + product.getDescription());
            System.out.println("Amount: " + productsInCart.get(product) + "\n");
            totalPrice += (product.getSellPrice() * productsInCart.get(product));
        }
        System.out.println("The total price is €" + totalPrice);
    }

    public void changeQuantityInCart(String productDescription, int newAmount) {
        Product product = searchProduct(productDescription);
        if (product != null) {
            productsInCart.replace(product, newAmount);  
            System.out.println("Your changes have been made.\n");
            showProductsInCart();
        }
    }

    public void removeProductFromCart(String productDescription){
        Product product = searchProduct(productDescription);
        if (product != null) {
            productsInCart.remove(product);
            System.out.println("The product has been removed from your Shopping Cart. \n");
            showProductsInCart();
        }
    }

    public void productsSold(){
        for (Product product : productsInCart.keySet()) {
            stock.removeFromStock(product, productsInCart.get(product));
        }
    }

    public Product searchProduct(String productDescription) {
        Product returnProduct = null;
        for (Product product : productsInCart.keySet()) {
            if (product.getDescription().equals(productDescription)) {
                returnProduct = product;
            }
        }
        if (returnProduct == null) {
            System.out.println("No products found that match your search :(");
        }
        return returnProduct;
    }
}