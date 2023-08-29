import java.util.Scanner;
class nameValidationException extends Exception{
    String name;
    nameValidationException(String str){
        name=str;
    }
}
class ageValidationException extends Exception{
    int age;
    ageValidationException(int age){
        this.age=age;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int count=0;
        try{
            for(int i=0;i<name.length();i++) {
                char temp = name.charAt(i);
                if ((temp < 'a' || temp > 'y') && (temp < 'A' || temp > 'Y')) {
                    throw new nameValidationException(name);
                } else count++;
            }
        }
        catch(nameValidationException ex){
            System.out.println("Invalid name");
        }
        if(count==name.length()) System.out.println("Valid name");

        int age=sc.nextInt();
        try{
            if(age<18)
                throw new ageValidationException(age);
            else System.out.println("Valid age");
        }
        catch(ageValidationException ex) {
            System.out.println("Invalid age");
        }
    }
}