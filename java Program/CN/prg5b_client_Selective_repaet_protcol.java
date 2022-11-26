import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Random;

public class prg5b_client_Selective_repaet_protcol {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 9999);
        int pos = 0;
        Random rand = new Random();

        DataInputStream di = new DataInputStream(s.getInputStream());
        DataOutputStream d = new DataOutputStream(s.getOutputStream());

        int len = di.read();
        int arr[] = new int[len];
        pos = rand.nextInt(len);
        arr[pos] = -1;
        for (int i = 0; i < arr.length; i++) {
            if (i != pos) {
                arr[i] = di.read();
            }
        }
        d.write(pos);

        System.out.println("pos Send Successfully" + pos);
        arr[pos] = di.read();
        System.out.println(arr[pos]);

    }
}
