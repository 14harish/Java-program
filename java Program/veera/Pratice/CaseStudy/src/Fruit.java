public class Fruit {
    private String name;
    public Fruit(String name) {
        this.name = name;
    }
    public boolean checkAvailability(double amount) {
        return false;
    }
    public double getPrice_per_kgs() {
        return 0.0;
    }
    public double getPrice_per_piece() {
        return 0.0;
    }
    public void updateAvailability(double amount) {
    }
    @Override
    public String toString() {
        return "Fruit{" + ", name='" + name + '\'' + '}';
    }
}