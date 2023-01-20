abstract class Sample{
    abstract void calculate(int a,int b);
}
class Addition extends sample{
     void calculate(int a ,int b){
        System.out.println(a+b);
     }
}
class Subtraction extends sample{
    void calculate(int a ,int b){
       System.out.println(a-b);
    }
}
class Multiplication extends sample{
    void calculate(int a ,int b){
       System.out.println(a*b);
    }
}

public class abstractEx2 {
    public static void main(String[] args) {
        Addition a=new Addition();
        Subtraction s=new Subtraction();
        Multiplication m=new Multiplication();
        a.calculate(10, 20);
        s.calculate(10, 20);
        m.calculate(10, 20);
    }
}
