import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class stopAndWait_Server {
 public static void main(String[] args) throws Exception{
    String temp="message";
    String str="exit";
    ServerSocket sc=new ServerSocket(8080);
    Socket input=sc.accept();

    Scanner get=new Scanner(input.getInputStream());
    PrintStream write=new PrintStream(input.getOutputStream());

    while(temp.compareTo(str)!=0){
        temp=get.next();
        if(temp.compareTo(str)==0){
            break;
        }
        Thread.sleep(5000);
        write.print("Recived");
        System.out.println("Recived"+temp+"Successfully");
    }
    System.out.println("All Data Recieved Successfully");
    sc.close();
 }   
}
