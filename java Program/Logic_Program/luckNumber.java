import java.util.ArrayList;
import java.util.HashSet;
class TestHumano
{
public static void main(String s[])
{
    String arr[]={"10","567", "597", "27","783"};
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
    // System.out.println(g);
    //  System.out.println(f.prime(g));
    if(f.prime(g)){
        System.out.println("Luckiest Number is:"+g);
    }
    else{
        int h=g;
        while(f.prime(h)!=true){
            h=h+1;
        }
        System.out.println("Luckiest Number is:"+h);
    }
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
int sum=0,n=0,v=0;
if(h.size()>1){
    for(int i=0;i<h.size();i++){
        sum+=j.get(i)-'0';
    }
}

if(sum>=10){
while(sum!=0){
    int s=sum%10;
    v+=s;
    sum=sum/10;
}}
else if(h.size()==0){
    v=-99;
}
else{
    v=j.get(0)-'0';
}

return v;
}
public static boolean prime(int n){
   boolean check=true;
   if(n==0 || n==1){
    check=false;
   }
   for(int i=2;i<=n/2;i++){
    // System.out.println(i);
    if(n%i==0){
        check=false;
        break;
    }
   }
   return check;    
}
}