import java.util.*;
public class crc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);       
        System.out.println("Enter Size:");
        int size=sc.nextInt();
        System.out.println("Enter data bit one by one:");
        int data[]=new int[size];
        for(int i=0;i<data.length;i++){
            data[i]=sc.nextInt();
        }
        System.out.println("Enter Size of Divisor:");
        int size1=sc.nextInt();
        int div[]=new int[size1];
        
        for(int i=0;i<div.length;i++){
            div[i]=sc.nextInt();
        }
        int rem[]=divided(data, div);
        System.out.println("CRC code:");
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]);
        }
        for(int j=0;j<rem.length-1;j++){
            System.out.print(rem[j]);
        }
        System.out.println("Enter To check the crc key:");
        int check[]=new int[data.length+(div.length-1)];
        for(int i=0;i<check.length;i++){
            check[i]=sc.nextInt();
        }
        rev(check,div);
    }
    public static void rev(int data[],int div[] ){
        int rem[]=divided(data, div);
        for(int i=0;i<rem.length;i++){
            System.out.println(rem[i]);
            if(rem[i]!=0){
                System.out.println("Corrupted data Received");
                return;
            }
        }
        System.out.println("Data Recieved");
    }

    public static int[]  divided(int olddata[],int divisor[]){
        int rem[]=new int[divisor.length];
        int data[]=new int[olddata.length+rem.length];
        System.arraycopy(olddata, 0, data, 0, olddata.length);
        System.arraycopy(data, 0, rem, 0, divisor.length);
        for(int i=0;i<olddata.length;i++){
            System.out.println((i+1)+" First Data bit "+rem[0]);
            if(rem[0]==1){
                for(int j=1;j<rem.length;j++){
                    rem[j-1]=xor(rem[j],data[j]);
                }
            }
            else{
                for(int j=1;j<rem.length;j++){
                    rem[j-1]=xor(rem[j],0);
                }
            }
            rem[rem.length-1]=data[i+divisor.length];
        }
        return rem;
    }
    public static int xor(int x,int y){
        if(x==y){
            return  0;
        }
        else{
            return 1;
        }
    }
}
