import java.util.Scanner;
import java.util.TreeSet;

// public class leakyBucket {
//     public static void main(String[] args) {
        // TreeSet<Integer> a=new TreeSet<>();
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter Business Network");
        // int L=sc.nextInt();
        // System.out.println("Enter Packet inter Arrival");
        // int i=sc.nextInt();
        // System.out.println("Enter Arrival Time of packet(Enter non integer value ar end)");
        // while(sc.hasNextInt()){
        //     a.add(sc.nextInt());
        // }
        // int lct=a.first();

        // int x=0;
        // for(Integer t:a){
        //     int temp=x-(t-lct);
        //     System.out.println(temp);
        //     if(temp>L){
        //         System.out.println("packet at time"+t+"is Not Conforming");
        //     }
        //     else{
        //         x=temp+i;
        //         lct=t;
        //         System.out.println("packet ");
        //     }
        // }
        public class leakyBucket {
            public static void main(String[] args) {
            int arr[]= {2,4,1,5,3,6,7,9};
            int size=9;
            int rate=3;
            String accept="";
            int send=0 ,remaining=0,i,c=0;
            for(i=0;i<arr.length;i++){
            accept="";
            c=0;
            if(arr[i]<=size){
            accept+=arr[i];
            }
            else{
            accept+="dropped";
            c++;
            }
            if(arr[i]<=rate) {
            send=arr[i]+remaining;
            if(send<rate){
            remaining=0;
            }
            else{
            remaining=send-rate;
            }
            }
            else{
            if(c==0) {
            remaining=arr[i]-rate;
            send=rate;
            }
            }
            if(i==0){
            System.out.println("ACCEPT"+" "+"SEND"+" "+"REMAINING");
            }
            if(c==0) {
            System.out.println(accept+"       "+send+"       "+remaining);
            }
            else{
            System.out.println(accept+" 0 "+"      0 ");
            }
            }           
            }
            }
           
//     }
// }
