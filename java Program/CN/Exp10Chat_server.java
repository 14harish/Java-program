import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Exp10Chat_server {
    public static void main(String[] args) throws Exception {
        DatagramSocket dc = new DatagramSocket(9999);
        byte[] receive = new byte[68989];
        DatagramPacket dp = null;
        while (true) {
            dp = new DatagramPacket(receive, receive.length);
            dc.receive(dp);
            System.out.println("client data:" + data(receive));
            if (data(receive).toString().equals("bye")) {
                System.out.println("Client Byee...");
                break;
            }
            receive = new byte[677989];
        }
    }

    public static StringBuffer data(byte[] a) {
        if (a == null) {
            return null;
        }
        StringBuffer sc = new StringBuffer();
        int i = 0;
        while (a[i] != 0) {
            sc.append((char) a[i]);
            i++;
        }
        return sc;
    }
}
