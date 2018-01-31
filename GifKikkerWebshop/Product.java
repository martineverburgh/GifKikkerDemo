public class Product {
    
    private String description;
    private Packaging packaging;
    private double volume;
    public Beer beer;
    private double price;
    
    public Product(String decr) {
        description = decr;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setPackaging(Packaging pack) {
        packaging = pack;
    }
    
    public void setVolume(double vol) {
        volume = vol;
    }
    
    public void setBeer(Beer beer) {
        this.beer = beer;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
}