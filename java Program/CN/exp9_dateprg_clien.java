import java.io.*;
import java.net.*;
import java.util.*;

public class exp9_dateprg_clien{
    public static void main(String[] args) throws IOException {
        Socket s =new Socket("localhost",9999);
        Scanner scan = new Scanner(s.getInputStream());
        String date = scan.nextLine();
        System.out.println(date);
        s.close();
    }
}
