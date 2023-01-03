class complex{
    int r=0,i=0;
    complex(int r,int i){
        this.i=i;
        this.r=r;
    }
    complex addMethod(complex a){
        a.i+=i;
        a.r+=r;
        return a;
    }
    @Override
    public String toString() {
        return r+" "+i+"i";
    }
}
public class complexAddinon {
    public static void main(String[] args) {
        complex c1=new complex(10, 11);
        complex c2=new complex(2,3);
        System.out.println(c1.addMethod(c2));
    }
}
