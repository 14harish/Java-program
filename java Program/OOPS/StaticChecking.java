import java.util.*;
public class StaticChecking {
            public static void main(String[] args) {       
                tail d=new tail();
                tail.regNo=11;
                d.setdata2(); 
                d.getdata();
                d.setdata();
                d.getdata();
                System.out.println(tail.regNo);//lastly modified will be Stored in static variable
                System.out.println(tail.a);   //static only refer with class name we cannot refer with object 
                System.out.println(d.b);     //instace variable can refer only with object 
            }       
            //Static method is stored in heap memory
    }
    
    class tail{
        static int a=19;
        int b=20;
        static int regNo;
        String college;
        String dpet;
        
        Scanner Sc=new Scanner(System.in);
        tail(){
            // this.getdata();
            // this.setdata();
        }
        static{
            System.out.println("Static Block");
            //Static block works first in the 
        }
        void getdata(){
            System.out.println(this.regNo+" "+this.college+" "+this.dpet);
        }
        void setdata(){
            regNo=10;
            college="ksr";
            dpet="ece";
        }
        void setdata2(){
            regNo=30;
            college="ksr";
            dpet="cse";
        }
    }

