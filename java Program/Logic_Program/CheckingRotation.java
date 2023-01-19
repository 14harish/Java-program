public class CheckingRotation {
    public static void main(String args[]){
        String ar1="ABCD";
        String ar2="ACBD";
        if(check(ar1,ar2)){
            System.out.println("Rotate");
        }
        else{
            System.out.println("Not Rotate");
        }
    }
    static boolean check(String ar1,String ar2){
        int count=0;
        String a="";
        while(count!=ar1.length() && !(ar2.equals(ar1))){
            a=ar2.substring(1)+ar2.charAt(0);
            ar2=a;
            count++;
        }
        // System.out.println(ar1+"--"+count+"--"+ar2);
        if(ar1.equals(ar2)){
            return true;
        }
        else{
            return false;
        }
    }
}
