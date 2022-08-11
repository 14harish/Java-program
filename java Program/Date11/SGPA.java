package Date11;
import java.util.*;
class student{
    String name;
    int rollno;
    String subject[];
    double cgpa;
    int sum,sum1;
    student(String name,int rollno,String[] subject,Double cgpa){
    this.name=name;
    this.rollno=rollno;
    this.subject=subject;
    this.cgpa=cgpa;
    }
    void CalSgpa(){
        int arr[]=new int[subject.length];
        for(int i=0;i<subject.length;i++){
            if(subject[i].equals("O")){
                sum=10*3;
            }
            if(subject[i].equals("A+")){
                sum=9*3;
            }
            if(subject[i].equals("A")){
                sum=8*3;
            }
            if(subject[i].equals("B+")){
                sum=7*3;
            }
            if(subject[i].equals("B")){
                sum=6*3;
            }
            if(subject[i].equals("F")){
                sum=0;
            }
            arr[i]=sum;
            sum1=arr[i]+sum1;
        }
        sum1=sum1/(5*3);
        System.out.println("SGPA is:"+sum1);
    }
    void calCgpa(){
        System.out.println("CGPA is:"+(cgpa+sum1)/2);
    }
}
public class SGPA {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String subject[]=new String[5];
    System.out.println("Enter Name:");
    String name=sc.nextLine();
    System.out.println("Enter RollNo:");
    int rollno=sc.nextInt();
    System.out.println("Enter Subject Grades:");
    for(int i=0;i<5;i++){
        int j=i+1;
        System.out.println("Subject"+j+":");
        subject[i]=sc.next();
    }
    System.out.println("Enter CGPA is:");
    double cgpa=sc.nextDouble();
    student s1=new student(name, rollno,subject,cgpa);
    s1.CalSgpa();
    s1.calCgpa();
}
}
