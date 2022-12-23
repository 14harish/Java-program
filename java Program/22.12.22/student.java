
class Detail{
    int regNo;
    String college;
    String dpet;
    Detail(int regNo,String college,String dpet){
        this.regNo=regNo;
        this.college=college;
        this.dpet=dpet;
    }
    void getdata(){
        
    }
    void setdata(){
        
    }
    public void display(){
        System.out.println(this.regNo+" "+this.college+" "+this.dpet);
    }
}
public class student {
    public static void main(String[] args) {       
         Detail d=new Detail(30, null, null);
         d.display();
    }
}

