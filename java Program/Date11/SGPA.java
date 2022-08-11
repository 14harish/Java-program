package Date11;
class student{
    String name;
    int rollno;
    String sub1;
    String sub2;
    String sub3;
    String sub4;
    String sub5;
    double cgpa;
    student(String name,int rollno,String sub1,String sub2,String sub3,String sub4,String sub5,double cgpa){
    this.name=name;
    this.rollno=rollno;
    this.sub1=sub1;
    this.sub2=sub2;
    this.sub3=sub3;
    this.sub4=sub4;
    this.sub5=sub5;
    this.cgpa=cgpa;
    }
    void print(){
        System.out.println("Name is:"+name+"\n"
                           +"Roll No is:"+rollno+"\n"
                           +"Sub1 Grade:"+sub1+"\n"
                           +"Sub2 Grade:"+sub2+"\n"
                           +"Sub3 Grade:"+sub3+"\n"
                           +"Sub4 Grade:"+sub4+"\n"
                           +"Sub5 Grade:"+sub5+"\n"
                           +"CGPA is:"+cgpa);
    }
    void CalSgpa(){
        
    }
}
public class SGPA {
public static void main(String[] args) {

    student s1=new student("Harish", 2013030,"A", "A", "O", "B+", "A+", 8.234);
    s1.print();
    System.out.println("haerish");
}
}
