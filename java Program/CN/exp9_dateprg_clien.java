import java.io.*;
import java.net.*;
import java.util.*;

public class exp9_dateprg_clien{
    public static void main(String[] args) throws IOException {
        Socket n=new Socket("localhost",9999);
        Scanner sc=new Scanner(n.getInputStream());
        String da=sc.nextLine();
        System.out.println(da);
        n.close();
        sc.close();
    }
}
