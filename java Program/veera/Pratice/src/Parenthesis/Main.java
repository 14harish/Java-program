/*()(()))(
 OP: 6 Possible longest paranthesis
 */
package Parenthesis;
public class Main {
    public static void main(String[] args){
        String str="()(()))(";
        int result=0;
        for(int i=0;i<str.length()-1;){
            char temp=str.charAt(i),temp1=str.charAt(i+1);
            if((temp=='('&&temp1==')')&&i==0){
                str=str.substring(i+2);
                result+=2;
                i=0;
                continue;
            }
            else if(temp=='('&&temp1==')'){
                str=str.substring(0,i)+str.substring(i+2);
                result+=2;
                i=0;
                continue;
            }
            i++;
        }
        System.out.println(result);
    }
}
