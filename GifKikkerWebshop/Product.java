public class Product {
    
    private String description;
    private Packaging packaging;
    private double volume;
    private Beer beer;
    
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
}