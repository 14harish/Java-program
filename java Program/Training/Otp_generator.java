public class otpgenerator {
public static void main(String[] args) {
String name= "Karan";
//System.out.println(name.length());
if(name.length()<2) {
System.out.println("Name should be minimum 2 letter");
}
else {
System.out.println(name);
int accountNO[]= {1,2,3,4,5,6,7,8,9,2,5};
//System.out.println(accountNO[11]);
System.out.println("1.Saving"+"2.Current"+"3.Loan");
int option= 2;
switch(option) {
case 1:
covertsav(name,accountNO,option);
break;

case 2:
covertsav(name,accountNO,option);
break;
case 3:
covertsav(name,accountNO,option);
break;
}
}
}
  static int digit(int a ) {
int e=0,sum=0,i=0,sum1=0,l=0,s=0;
while(a!=0) {
int b=a%10;
sum=sum+b;
a=a/10;
}
sum1=sum;
 while(sum!=0) {
e=sum%10;
i++;
sum=sum/10;
}
 //return i;
if(i==2) {
while(sum1!=0) {
l=sum1%10;
s=s+l;
sum1=sum1/10;
}
return s;
 }
 else {
 return sum1;
 }
  }
  static void covertsav(String name,int accountNO[],int option) {
 String[] ac=new String[8];
String f =null,L=null,start=null,last=null;
int s1=0,s2=0;
if(option==1) {
ac[0]="s";
ac[1]="a";
}
if(option==2) {
ac[0]="c";
ac[1]="u";
}
if(option==3) {
ac[0]="l";
ac[1]="o";
}
for(int i=0;i<accountNO.length;i++) {
if(i==0) {
f=accountNO[i]+"";
}
if(i==10) {
L=accountNO[i]+"";
}
if(i<5) {
//System.out.println(accountNO[i]);
s1=s1+accountNO[i];
}
if(i>=5&i<10) {
//System.out.println(accountNO[i]);
s2=s2+accountNO[i];
}
}
char ch[]=name.toCharArray();
char Fc = 0,Lc=0;
for(int i=0;i<ch.length;i++) {
if(i==0) {
Fc=ch[i];
}
if(i==ch.length-1) {
Lc=ch[i];
}

}
//System.out.println(Fc);
//System.out.println(Lc);
int ss=digit(s1);
int ss1=digit(s2);
start=ss+"";
last=ss1+"";
//System.out.println(ss);
//System.out.println(f);
//System.out.println(s2);
/*for(int i=0;i<ac.length;i++) {
System.out.println(ac[i]);
}
*/
ac[2]=f;
ac[3]=start;
ac[4]=Fc+"";
ac[5]=last;
ac[6]=Lc+"";
ac[7]=L;
for(int i=0;i<ac.length;i++) {
System.out.print(ac[i]);
}
}  
}

