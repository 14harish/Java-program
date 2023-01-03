import java.util.Scanner;

class employee{
    String name;
    int yog;
    String address;
    employee(String name,int yog,String address){
        this.name=name;
        this.yog=yog;
        this.address=address;
    }
    void print(){
        System.out.println("Name is:"+this.name+"---"+"Year of Joining:"+this.yog+"----"+"Address:"+this.address);
    }
}
public class employeeDetail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No of Employee");
        int s=sc.nextInt();
        sc.nextLine();
        employee emp[]=new employee[3]; 
        for(int i=0;i<s;i++){
            System.out.println("Enter the Name");
            String n=sc.nextLine();
            System.out.println("Enter Year of Joining");
            int yog=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter address");
            String add=sc.nextLine();
            emp[i]=new employee(n, yog, add);
        }
        for(int i=0;i<s;i++){
            emp[i].print();
        }
    }
}
