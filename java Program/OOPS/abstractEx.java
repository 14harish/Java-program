//abstraction is process of hiding the implementation detail for user
//when declaring abstact class and abstract method that abstract method can be used in other class with different
//condition by extending the abstract class
//package OOPS;
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
    