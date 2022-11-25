import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
import java.util.Date;

public class exp9_dateprg_serv{
    public static void main(String[] args) throws IOException {
        ServerSocket ser =new ServerSocket(9999);
        while (true) {
            System.out.println("waiting for connection .....");
            Socket s =ser.accept();
            DataOutputStream wri =new DataOutputStream(s.getOutputStream());
            wri.writeBytes("Date of the server is : "+(new Date().toString()));
            s.close();
            wri.close();
        }
    }
}
