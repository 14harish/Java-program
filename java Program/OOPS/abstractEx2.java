class Sample{
    // abstract void calculate(int a,int b);
    // abstract void check();
    int data=10*2;
}
class Addition extends Sample{
     void calculate(int a ,int b){
        System.out.println(a+b);
     }
     void check(){
        System.out.println("check1");
        System.out.println(data);
     }
}
class Subtraction extends Sample{
    void calculate(int a ,int b){
       System.out.println(a-b);
    }
    void check(){
        System.out.println("check2");
     }
}
class Multiplication extends Sample{
    void calculate(int c ,int d){
       System.out.println(c*d);
    }
    void check(){
        System.out.println("check3");
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
        a.check();
        s.check();
        m.check();
    }
}
