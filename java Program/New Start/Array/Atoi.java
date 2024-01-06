public class Atoi {
    public static void main(String[] args) {
            // Your code here
            String str="123";
            int num=0,n=0;
            for(int i=0;i<str.length();i++){
                if((!(Character.isDigit(str.charAt(i)))&& i!=0) || Character.isAlphabetic(str.charAt(i))) System.out.println(-1);;
                if(Character.isDigit(str.charAt(i))) num=num*10+(str.charAt(i)-'0');
            }
            if(str.charAt(0)=='-'){
                num=num*-1;
            }
            System.out.println(num);
    }
}
