interface top{
    int getInterest();
}
interface Bank extends top{
    void Setintrest(int n);
}
class sbi implements Bank{
    int inter;
    @Override
    public void Setintrest(int inter) {
        this.inter=inter;
    }
    @Override
    public int getInterest() {
        return inter;
    }
}
class icic implements Bank{
    int inter;
    @Override
    public void Setintrest(int inter) {
        this.inter=inter;
    }

    @Override
    public int getInterest() {
        return inter;
    }
}
public class interface_prg {
    public static void main(String[] args) {
       Bank b=new sbi();
       Bank c=new icic();
       b.Setintrest(10);
       c.Setintrest(12);
       System.out.println(b.getInterest()+" "+c.getInterest());
    }
}
