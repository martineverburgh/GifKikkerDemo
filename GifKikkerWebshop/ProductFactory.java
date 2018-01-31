public class ProductFactory {
    
    private Beer gifKikker, heineken, grolsch, hertogJan;
    private Stock stock;
    
    public ProductFactory() {
        stock = new Stock();        
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
        Product gk_6p = new Product("GifKikker Six-pack");
        gk_6p.setBeer(gifKikker);
        gk_6p.setPackaging(Packaging.SIXPACK);
        gk_6p.setVolume(1980);
        // hier voeg ik bovenstaand product toe aan de stock HashMap om de voorraad bij te houden.
        // ik zet het aantal hier op 10 stuks.
        stock.addProduct(gk_6p,10);
        
        Product gk_fl = new Product("GifKikker Flesje");
        gk_fl.setBeer(gifKikker);
        gk_fl.setPackaging(Packaging.FLESJE);
        gk_fl.setVolume(300);
        stock.addProduct(gk_fl,100);
        
        Product hk_cf = new Product("Heineken Champagnefles");
        hk_cf.setBeer(heineken);
        hk_cf.setPackaging(Packaging.CHAMPAGNEFLES);
        hk_cf.setVolume(750);
        stock.addProduct(hk_cf,2);
        
        Product gr_fu = new Product("Grolsch Fust");
        gr_fu.setBeer(grolsch);
        gr_fu.setPackaging(Packaging.FUST);
        gr_fu.setVolume(20_000);
        stock.addProduct(gr_fu,5);
        
        Product hj_kr = new Product("Hertog Jan Krat");
        hj_kr.setBeer(hertogJan);
        hj_kr.setPackaging(Packaging.KRAT);
        hj_kr.setVolume(7200);
        stock.addProduct(hj_kr,50);
    }
    
    public void printStockList() {
        stock.printStockList();
    }
}