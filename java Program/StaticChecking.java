import java.util.*;
public class StaticChecking {
            public static void main(String[] args) {       
                tail d=new tail();
                d.setdata();
                d.getdata();
                System.out.println(tail.a); //static only refer with class name we cannot refer with object 
                System.out.println(d.b); //instace variable can refer only with object 
            }       
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
            dpet="cse";
        }
    }

