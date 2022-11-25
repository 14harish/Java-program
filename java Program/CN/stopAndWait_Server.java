import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class stopAndWait_Server {
 public static void main(String[] args) throws Exception{
    run();
 }   
 public static void run() throws Exception{
    String temp="message",str="exit";
    ServerSocket sc=new ServerSocket(9999);
    Socket input=sc.accept();

    Scanner get=new Scanner(input.getInputStream());
    PrintStream write=new PrintStream(input.getOutputStream());

    while(temp.compareTo(str)!=0){
        temp=get.next();
        if(temp.compareTo(str)==0){
            System.out.println("heei");
            break;
        } 
        System.out.println("Recived "+temp+" Successfully");
        Thread.sleep(5000);
        write.print("Recived");
        System.out.println("hi");
    }
    System.out.println("All Data Recieved Successfully");
    sc.close();
 }
}
