public class StringChecking {
public static void main(String[] args) {
String str1="HARISH";
String str2="AIOP";
str1=removeDup(str1);
str2=removeDup(str2);
StringBuffer s=new StringBuffer();
StringBuffer s1=new StringBuffer();
int arr1[]=new int[str1.length()];
int arr2[]=new int[str2.length()];
for(int i=0;i<str1.length();i++)
{
for(int j=0;j<str2.length();j++)
{
if(str1.charAt(i)==str2.charAt(j)) {
arr1[i]=-1;
arr2[j]=-1;
}
}
if(arr1[i]!=-1) {
s.append(str1.charAt(i));
}
}
for(int i=0;i<arr2.length;i++) {
if(arr2[i]!=-1) {

s1.append(str2.charAt(i));
}
}
s.append(s1);
System.out.println(s);
}
static String removeDup(String str1) {
char s1[]=str1.toCharArray();
StringBuffer sc=new StringBuffer();
int[] arr=new int[s1.length];
for(int i=0;i<s1.length;i++)
{
for(int j=i+1;j<str1.length();j++)
{
if(s1[i]==s1[j])
{
arr[j]=-1;
}
}
if(arr[i]!=-1)
{
sc.append(s1[i]);
}
}
String str=sc.toString();
return str;
}
}
