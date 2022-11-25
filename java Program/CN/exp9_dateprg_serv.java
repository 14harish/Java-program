import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
import java.util.Date;

public class exp9_dateprg_serv{
    public static void main(String[] args) throws IOException {
     ServerSocket sv=new ServerSocket(9999);
     while(true){
        Socket s=sv.accept();
        DataOutputStream d=new DataOutputStream(s.getOutputStream());
        d.writeBytes("Server Date"+(new Date()).toString());
        s.close();
        d.close();
     }
    }
}
