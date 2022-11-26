import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class prg5b_server_Selective_repaet_protcol {
    public static void main(String[] args) throws Exception{
       try{
        int arr[]={1,2,3,4,5};
        ServerSocket sc=new ServerSocket(9999);
        Socket s=sc.accept();

        DataInputStream di=new DataInputStream(s.getInputStream());
        DataOutputStream d=new DataOutputStream(s.getOutputStream());

        System.out.println("Number packet Sent:"+arr.length);
        d.write(arr.length);
        // d.flush();
        for(int i=0;i<arr.length;i++){
            d.write(arr[i]);
            // d.flush();
        }
        int pos=di.read();
        d.write(pos);
        } 
        catch(Exception E){
            System.out.println(E);
        }
    }
}
