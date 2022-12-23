
public class Even_odd_palidrom {
    public static void main(String[] args) {
        String in="daccad";
        StringBuffer even =new StringBuffer();
        StringBuffer odd =new StringBuffer();
        for(int i=0;i<in.length();i++){
            if(i==0 || i%2==0){
                even.append(in.charAt(i)+"");
            }
            else{
                odd.append(in.charAt(i)+"");
            }
        }
        String Eve=even.toString();
        String Odd=odd.toString(); 
        String revEve=even.reverse().toString();
        String revOdd=odd.reverse().toString();
        System.out.println(Eve+" "+revEve);
        System.out.println(Odd+" "+revOdd);
        if(Eve.equals(revEve) && Odd.equals(revOdd)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
