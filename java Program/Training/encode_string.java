public class EncodeString{
public static void main(String[] args) {
String input="AM2x9";
//259z4R18e
int key=0;
char[] in=input.toCharArray();
int[] num=new int[in.length];
int[] n=new int[in.length];
for(int i=0;i<in.length;i++) {
if(in[i]>48&&in[i]<58) {
num[i]=Character.getNumericValue(in[i]);
}
n[i]=num[i]*num[i];
key+=n[i];
// System.out.println(key)
}
convert(num,in,key);

}
static int[] find(int num[],int key) {
int[] result=new int[num.length];
for(int i=0;i<result.length;i++) {
if(num[i]!=0) {
result[i]=num[i]+key;
while(result[i]>26) {
result[i]=result[i]-26;
}
}
}
// for(int i=0;i<result.length;i++) {
// System.out.println(result[i]);
// }
return result;
}
static void convert(int num[],char in[],int key) {
int result[]=find(num,key);
int flag=0;
String[] sc=new String[num.length];
char caps[]= { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
char small[]= { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h','i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u','v', 'w', 'x', 'y', 'z'};
for(int i=0;i<in.length;i++) {
for(int j=0;j<small.length;j++) {
if(in[i]>48||in[i]<58) {
if(in[i-1]==caps[j]) {
System.out.println(in[i]);
flag=1;
}
else {
  flag=2;
}
}
}
}
for(int i=0;i<in.length;i++) {
for(int j=0;j<small.length;j++) {
if(result[i]!=0) {
if(result[i]==j) {
if(flag>1) {
sc[i]=caps[j-1]+"";
}
else {
sc[i]=small[j-1]+"";
}
}
}
}
}
for(int i=0;i<num.length;i++) {
for(int j=0;j<small.length;j++) {
if(in[i]==caps[j]||in[i]==small[j]) {
sc[i]=j+1+"";
}
}
}
for(int i=0;i<sc.length;i++) {
System.out.print(sc[i]);
}
}
}
