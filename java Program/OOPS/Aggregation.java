
class Detail{
    String name;
    int age;
    Detail(String name,int age){
        this.name=name;
        this.age=age;
    }
    void fun(int x){
        System.out.println("I am Detail"+"---"+x);
    }
    int add(int a,int b){
        return a+b;
    }
}
class p{
    Detail get; //Aggregation getting the details from above class detail we can acess the above property value in this class
    int x;

    p(Detail get,int x){
        this.get=get;
        this.x=x;
    }

    void display(){
        System.out.println(get.age+"----"+get.name+"----"+x);
        get.fun(x);
        System.out.println(get.add(x,get.age));
    }
}

public class Aggregation {
    
    public static void main(String[] args) {
        Detail o=new Detail("harish", 20);
        p n=new p(o, 2);  //by passing object we can use that class properties are value
        n.display();
    }
}
