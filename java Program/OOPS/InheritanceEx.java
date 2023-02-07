//package OOPS;
//for multilevel inheritance
class A{
    void Afunc(){
        System.out.println("Single A");
    }
}
class B extends A{
    void Bfunc(){
        System.out.println("Single B");
    }
}
class C extends B{
    void Cfunc(){
        System.out.println("Single C");
    }
}

//for hirarichical inheritance
class A1{
    void A1func(){
        System.out.println("Multiple A1");
    }
}
class B1 extends A1{
    void B1func(){
        System.out.println("Multiple B1");
    }
}
class C1 extends A1{
    void C1func(){
        System.out.println("Multiple C1");
    }
}

public class InheritanceEx {
    public static void main(String[] args) {
        //multilevel inheritance
        A a2=new B();  //In this can only access A class
        A a3=new C(); //In this can only access A class
        A a4=new A(); //In this can only access A class
        a2.Afunc();
        a3.Afunc();
        a4.Afunc();

        B b1=new B();  //In this cannot access C class
        B b2=new C(); //In this cannot access C class
        b1.Afunc();
        b1.Bfunc();
        b2.Afunc();
        b2.Bfunc();

        C a1=new C(); //This can all the method in the class
        a1.Afunc();
        a1.Bfunc();
        a1.Cfunc();


        //hirarchical inheritance
        C1 dhar=new C1(); // using this we cannot acces the B1 class
        dhar.A1func();
        dhar.C1func();

        B1 har=new B1();
        har.A1func();     //using this we cannot access the C1 class
        har.B1func();

        A1 hd=new A1();   //using this we can only access the  A1 class
        hd.A1func();
    }
}
