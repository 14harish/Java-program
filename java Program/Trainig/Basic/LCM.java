package Trainig.Basic;

public class LCM {
    public static void main(String[] args) {
        int n1=15,n2=20;
        int large = n1 < n2 ? n2:n1;
        int small = n1 < n2 ? n1:n2;
        int lcm=large;
        while(lcm%small!=0){
            lcm+=large;
        }   
        System.out.println(lcm);
    }
}
