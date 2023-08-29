public class Sales {
    // private int code;
    private Fruit fObj;
    private double unit;
    private double amount;
    private double gst;

    // static int counter = 1000;
    public Sales(Fruit fObj, double unit) {
        this.fObj = fObj;
        this.unit = unit;
// this.code = ++counter;
    }

    public double bill() {
        if (!fObj.checkAvailability(unit)) {
            return -1;
        }
        if (fObj instanceof FruitInGms) {
            amount = fObj.getPrice_per_kgs() * unit;

        } else if (fObj instanceof FruitInPcs) {
            amount = fObj.getPrice_per_piece() * unit;
        }
        if (amount > 500) {
            amount = discount(amount);
        }
        fObj.updateAvailability(unit);
        return amount;
    }

    public double discount(double amount) {
        int discount = (int) (amount / 100 * 5);
        amount = amount - discount;
        return amount;
    }

    @Override
    public String toString() {
        return "Sales{" + ", fObj=" + fObj + ", unit=" + unit + ", amount=" + amount + '}';
    }
}