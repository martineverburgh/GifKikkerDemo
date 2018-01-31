public class ProductFactory {
    
    private Beer gifKikker, heineken, grolsch, hertogJan;
    
    public ProductFactory() {
    }
    
    public void startWebShop() {
        createBeer();
        createProducts();
    }
    
    private void createBeer() {
        gifKikker = new Beer(7.5);
        heineken = new Beer(5.0);
        grolsch = new Beer(5.0);
        hertogJan = new Beer(5.1);
    }
    
    private void createProducts() {
        
    }
}