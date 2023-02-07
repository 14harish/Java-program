import java.util.*;
public class concept {
        public static void main(String[] args) {       
            Detail d=new Detail();
            Detail e=new Detail();
            Detail.regNo=10;
            System.out.println(Detail.regNo);
        }
}

class Detail{
    static int regNo;
    String college;
    String dpet;
    Scanner Sc=new Scanner(System.in);
    Detail(){
        // this.getdata();
        // this.setdata();
    }
    void getdata(){
        System.out.println(regNo+" "+this.college+" "+this.dpet);
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