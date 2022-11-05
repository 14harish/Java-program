import java.util.ArrayList;
class TestHumano
{
public static void main(String s[])
{
    String arr[]={"1783","367","5973"};
    StringBuffer sc=new StringBuffer();
    FindLuckyDigit f=new FindLuckyDigit ();
    ArrayList<Integer> al=new ArrayList<Integer>();

for(int i=0;i<arr.length;i++)
{
    al.add(Integer.parseInt(arr[i]));
    sc.append(arr[i]+"");
}
    System.out.println(sc);
    System.out.println(f. luckyDigit (al,sc));
}
}
class FindLuckyDigit
{
public int luckyDigit (ArrayList<Integer> input1,StringBuffer sc)
{
//Write your code here
for(int i=0;i<input1.size();i++){
   for(int j=0;j<sc.length();j++){
    
   }
}

return 10;
}
}