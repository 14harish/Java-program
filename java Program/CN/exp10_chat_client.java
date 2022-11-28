import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class exp10_chat_client {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DatagramSocket ds = new DatagramSocket();
        InetAddress ip = InetAddress.getLocalHost();
        byte[] buf = null;
        while (true) {
            String inp = sc.nextLine();
            buf = inp.getBytes();
            DatagramPacket dp = new DatagramPacket(buf, buf.length, ip, 9999);
            ds.send(dp);
            // System.out.println(buf);
            if (inp.equals("bye")) {
                break;
            }
        }
        ds.close();
        sc.close();
    }
}
