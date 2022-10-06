
abstract class shop{
    abstract int fruitPrice();
}
class supermarket extends shop{
    int fruitPrice(){
        return 100;
    }
}
class localshop extends shop{
    int fruitPrice(){
        return 50;
    }
}

public class abstractEx {
    public static void main(String[] args) {
       shop s=new supermarket();
       System.out.println("fruit price in SuperMarket:"+s.fruitPrice());
       shop s1=new localshop();
       System.out.println("Fruit price in Localshop:"+s1.fruitPrice());
    }
}
