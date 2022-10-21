public class Encoding_three_string {
public static void main(String[] args)
{
String in1="harishrrr";
String in2="kumar";
String in3="ajay";
String i3[]=Split(in3);
String i2[]=Split(in2);
String i1[]=Split(in1);
// for(int i=0;i<in2.length();i++) {
// System.out.println(i2[i]);
// }
String f1=i1[0]+""+i2[1]+""+i3[2];
String f2=i1[1]+""+i2[2]+""+i3[0];
String f3=i1[2]+""+i2[0]+""+i3[1];
StringBuffer f4=new StringBuffer();
for(int i=0;i<f3.length();i++)
{
if(Character.isLowerCase(f3.charAt(i)))
{
f4.append(Character.toUpperCase(f3.charAt(i)));
}
if(Character.isUpperCase(f3.charAt(i)))
{
f4.append(Character.toLowerCase(f3.charAt(i)));
}
}
System.out.println(f1);
System.out.println(f2);
System.out.println(f4);

}
static String[] Split(String in1)
{
String[] a=new String[3];
if(in1.length()%3==0) {
int n=in1.length()/3,c=n;
for(int i=0;i<in1.length();)
{
 for(int j=0;j<a.length;j++)
 {
  a[j]=in1.substring(i,n);
i=i+c;
n+=c;    
}
}
}
else if(in1.length()%3==2)
{
a[0]=in1.substring(0,2);
a[1]=in1.substring(2,3);
a[2]=in1.substring(3,5);
}
else if(in1.length()%3==1)
{
a[0]=in1.substring(0,1);
a[1]=in1.substring(1,3);
a[2]=in1.substring(3,4);
}
return a;
}
}


