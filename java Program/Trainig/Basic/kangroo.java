package Trainig.Basic;

public class kangroo {
    public static void main(String[] args) {
        int k1=0,k2=4,j1=3,j2=2;//test case 0 3 4 2  , 0 2 4 5
        if(j1<=j2){
            System.out.println("no");
        }
        else if(Math.abs(k1-k2)%Math.abs((j1-j2))==0){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}
