public class Nambiar_Number {
    public static void main(String[] args) {
        long n=9880127431l;
        int sum=0;
        StringBuffer sc=new StringBuffer();
        String str=Long.valueOf(n).toString(n);
        // System.out.println(str);
        // System.out.println(n);
        int s=str.charAt(0)-'0';
        for(int i=0;i<str.length()-1;i++){
            // System.out.println(s);
            if(s%2==0){
                // System.out.println(s);
                sum+=str.charAt(i)-'0';
                if(sum%2!=0){
                    sc.append(sum);
                    sum=str.charAt(i+1)-'0';
                    s=str.charAt(i+1)-'0';
                    i++;
                }
            }
            else{
                sum+=str.charAt(i)-'0';
                if(sum%2==0){
                    sc.append(sum);
                    sum=str.charAt(i+1)-'0';
                    s=str.charAt(i+1)-'0';
                    System.out.println(s);
                    i++;
                }
            }  
        }
        if(sum==str.charAt(str.length()-1)-'0'){
            sc.append(str.charAt(str.length()-1));
        }else{
            sc.append((sum+str.charAt(str.length()-1))-'0');
        }
        
        System.out.println(sc);

    }    
}
