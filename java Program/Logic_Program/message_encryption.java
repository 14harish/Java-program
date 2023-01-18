
public class message_encryption {
  public static void main(String[] args) {
    int n=4;
    String str="Hello-World!";
    StringBuffer sc=new StringBuffer();
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)>='a' && str.charAt(i)<='z' ||str.charAt(i)>='A' && str.charAt(i)<='Z'){
          if(str.charAt(i)+n>='z'){
            int x=(str.charAt(i)+n-1)-'z';
            sc.append((char)('a'+x)+" ");
          }
          else if(str.charAt(i)+n>='Z' && !(str.charAt(i)>='a' && str.charAt(i)<='z')){
            if(str.charAt(i)+n>='Z'){
              int x=(str.charAt(i)+n-1)-'Z';
              sc.append((char)('A'+x)+" ");
            }
          }
          else{
            sc.append((char)(str.charAt(i)+n)+" ");
          }
        }
        else{
            sc.append(str.charAt(i)+" ");
        }
    }
    System.out.println(sc);
  }    
}
