import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int len=input.length();
        if(len%2 !=0){
            System.out.println("Unbalence");
            return;
        }
        char[] arr=input.toCharArray();
        ArrayList<Character> arrLst=new ArrayList();
        for(int i=0;i<arr.length;i++)
            arrLst.add(arr[i]);
        boolean flag=false;
        for(int i=0;i<arrLst.size();i++){
            int temp=arrLst.get(i);
            for(int j=i+1;j<arrLst.size();j++){
                int temp1=arrLst.get(j);
                if((temp==(temp1-1))||(temp==(temp1-2))){
                    arrLst.remove(j);
                    arrLst.remove(i);
                    flag=true;
                    i--;
                    break;
                }
                else flag=false;
            }
            if(flag==false){
                System.out.println("Unbalence");
                return;
            }
        }
        if(flag==true) System.out.println("Balence");
        // System.out.println(arrLst.size());
    }
}