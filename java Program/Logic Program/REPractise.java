

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.regex.*;

public class REPractise {
    public static void main(String[] args) {
        // Pattern p=Pattern.compile("[a-z]|[0-9]");//this will match both number and alphabets
        Pattern p=Pattern.compile("[.]{3}"); //^a starts with a
        Matcher m=p.matcher("jalsjd9asfl80.g.");
        System.out.println(m.find());
       ArrayList<String> s=new ArrayList<>();
       Collections.sort(null);
    }
}
