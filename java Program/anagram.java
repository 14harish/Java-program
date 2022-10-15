public class anagram {
public static void main(String[] args) {
String str1="Mother In Law";
String str2="Hitler Woman";
String s1=Order(str1.toLowerCase());
String s2=Order(str2.toLowerCase());
System.out.println(s1);
System.out.println(s2);
if(s1.equals(s2)) {
System.out.println("String is anagram");
}
else {
System.out.println("String is Not anagram");
}
}
static String Order(String str) {
String s2=" ";
char temp;
char[] s1=str.toCharArray();
for(int i=0;i<str.length();i++) {
for(int j=i+1;j<str.length();j++) {
if(s1[i]>s1[j]) {
temp=s1[i];
s1[i]=s1[j];
s1[j]=temp;
}
}
}
    s2=String.copyValueOf(s1);
return s2;
}
}
