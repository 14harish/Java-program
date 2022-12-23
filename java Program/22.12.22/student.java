import java.util.*;
class Detail{
    int regNo;
    String college;
    String dpet;
    
    Scanner Sc=new Scanner(System.in);
    
    void getdata(){
        System.out.println(this.regNo+" "+this.college+" "+this.dpet);
    }
    void setdata(){
        System.out.println("Enter the RegNo");
        regNo=Sc.nextInt();
        Sc.nextLine();
        System.out.println("Enter the college");
        college=Sc.nextLine();
        System.out.println("Enter the Dept");
        dpet=Sc.nextLine();
    }
}
public class student {
    public static void main(String[] args) {       
         Detail d=new Detail();
         d.setdata();
         d.getdata();
    }
}

