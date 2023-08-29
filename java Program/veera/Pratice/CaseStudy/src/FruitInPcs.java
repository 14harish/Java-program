public class FruitInPcs extends Fruit{
    private int available_pcs;
    private double price_per_piece;
    public FruitInPcs(String name, int available_pcs, double
            price_per_piece) {
        super(name);
        this.available_pcs = available_pcs;
        this.price_per_piece = price_per_piece;
    }
    public double getPrice_per_piece() {
        return price_per_piece;
    }
    @Override
    public boolean checkAvailability(double need){
        return available_pcs >= need;
    }
    @Override
    public void updateAvailability(double need){
        available_pcs = (int) (available_pcs - need);
    }
    @Override
    public String toString() {
        return "FruitInPcs{" + "available_pcs=" + available_pcs + ", price_per_piece=" + price_per_piece + '}';
    }
}