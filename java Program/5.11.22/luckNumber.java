import java.util.ArrayList;
import java.util.HashSet;
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
String c=sc.toString();
char a[]=c.toCharArray();
  //  System.out.println(sc);
    int g=f. luckyDigit (arr,a);
    System.out.println(g);
    System.out.println(f.prime(g));
}
}
class FindLuckyDigit
{
public int luckyDigit (String[] input1,char[] sc)
{
HashSet<Character> h=new HashSet<>();
//Write your code here
for(int i=0;i<sc.length;i++){
    int count=0;
   for(int j=0;j<input1.length;j++){
    //System.out.println(input1[j]+"-->"+sc[i]);
    String s=input1[j];
    if(s.contains(sc[i]+"")){
        // System.out.println(sc[i]+"--"+count);
      count++;
      if(count==input1.length){
        h.add(sc[i]);
        count=0;
      }
    }
   }
}
ArrayList<Character> j=new ArrayList<>(h);
int sum=0,n=0,v=0;;
if(h.size()>1){
    for(int i=0;i<h.size();i++){
        sum+=j.get(i)-'0';
    }
   
    while(sum!=0){
        int s=sum/10;
        v+=s;
        s=s%10;
    }
}
return v;
}
public static boolean prime(int n){
   boolean check=true;
    for(int i=0;i<n/2;i++){
    for(int j=2;j<n;j++){
        if(j%n==0){
            check=false;
        }
    }
   }
   return check;    
}
}