
public class finding_index_prime_concept {
    public static void main(String[] args) {
        String name="divakaran";
        name=name.toLowerCase();
        boolean count=true;
        for(int i=0;i<name.length();i++){
            int c=name.charAt(i)-96;
            count=true;
            if(c==1){
                count=false;
            }
            for(int j=2;j<=c/2;j++){
                count=true;
                if(c%j==0){
                    count=false;
                    break;
                }
            }
        if(count==true){
            System.out.println(name.charAt(i));
        }
        }
    }    
}
