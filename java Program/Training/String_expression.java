package Training;
public class String_expression {
public static void main(String[] args) {

//System.out.println(n1);
String operation="1+2*3+4";
char[] o=operation.toCharArray();
char[] operator= {'+','/','*','%','-'};
// System.out.println(o[o.length-1]);
// if(Check(o)==true) {
// System.out.println("valid");
// }
// else {
// System.out.println("Not valid");
// }
if(Check2(o,operator)==true) {
System.out.println("valid");
}
else {
System.out.println("Not valid");
}
//logic(operation,operator);
}
static boolean Check(char o[]) {
char n1=48,n2=58,n3=40,n4=41;
char pos=o[o.length-1];
//System.out.println(o[0]);
    if(o[0]>n1&&o[0]<n2&&pos>n1&&pos<n2) {
    return true;
}
    else if(o[0]==n3||o[0]==n4||pos==n3||pos==n4) {
    return true;
    }
else {
return false;
}
}
static boolean Check2(char o[],char operator[]) {
char n1=48,n2=58,n3=40,n4=41;
int count=1,check=1;
for(int i=0;i<o.length-1;i++) {
if(o[i]==o[i+1]) {
//
if(o[i]>n1&&o[i]<n2) {
//System.out.println(o[i]);
count++;
}
else {
count=1;
break;
// System.out.println(o[i]);
}
}
}
for(int i=0;i<o.length;i++) {
//System.out.println(o[i]);
for(int j=0;j<operator.length;j++) {
//
if(o[i]>1&&o[i]<9&&o[i]==operator[j]) {
System.out.println(operator[j]);
//System.out.println("hi");
check++;
}
else {
// System.out.println(check);
// System.out.println(o[i]);
 check=1;
 
}
}
}
if(count==1&&check==1) {
return false;
}
else {
return true;
}
}
static void logic(String s1,char operator[]) {
String[] words=s1.split("\\+");//splits the string based on whitespace  
//using java foreach loop to print elements of string array  
for(String w:words){  
System.out.println(w);  
}  
}
}
