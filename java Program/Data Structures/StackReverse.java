import java.util.Stack;

public class StackReverse {
    public static String reverse(String str){
        Stack<Character> s=new Stack<Character>();
        char[] ch=str.toCharArray();
        for(char c:ch){
            s.push(c);
        }
        for(int i=0;i<str.length();i++){
            ch[i]=s.pop(); //poping element will be first element of the stack
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        String str="harish";
        System.out.println(reverse(str));
    }
}
