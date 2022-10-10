//package OOPS;
class sample{
    //stcatic block will exectute first when object is created for the class 
    sample(){
        //this is also same as satic this will also execute when the object is created for the class 
        System.out.println("Inside the constructor");
    }
    static {
        System.out.println("This is first Static");
    }
    static void smp(){
        System.out.println("This inside in the function");
    }
    static{
        //when calling in static it works automatical when object is created for this class
        smp();
    }
}

public class StaticBlockEx {
    public static void main(String[] args) {
        sample s=new sample();
    }
}
