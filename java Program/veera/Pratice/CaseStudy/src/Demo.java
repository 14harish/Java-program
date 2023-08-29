public class Demo {
    public static void main(String[] args) {
        Fruit obj = new FruitInGms("Apple",50.6,80.0);
        Sales s = new Sales(obj, 3);
        double bill1 = s.bill();
        System.out.println(bill1);
        Fruit obj1 = new FruitInPcs("Banana",200,40);
        Sales s1 = new Sales(obj1, 10);
        double bill2 = s1.bill();
        System.out.println(bill2);
    }
}
