//FruitInGms.java
public class FruitInGms extends Fruit{
    private double available_kgs;
    private double price_per_kgs;
    public FruitInGms(String name, double available_kgs,
                      double price_per_kgs) {
        super(name);
        this.available_kgs = available_kgs;
        this.price_per_kgs = price_per_kgs;
    }
    public double getPrice_per_kgs() {
        return price_per_kgs;
    }
    @Override
    public boolean checkAvailability(double need){
        return available_kgs >= need;
    }
    @Override
    public void updateAvailability(double need){
        available_kgs = available_kgs - need;
    }
    @Override
    public String toString() {
        return "FruitInGms{" + "available_kgs=" + available_kgs + ", price_per_kgs=" + price_per_kgs + '}';
    }
}