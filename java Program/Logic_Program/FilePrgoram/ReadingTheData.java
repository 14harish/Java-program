package FilePrgoram;
import java.io.File;
import java.io.FileWriter;
import java.util.*;
public class ReadingTheData{
    public static void main(String[] args) throws Exception {        
        try (FileWriter myWriter = new FileWriter("D:/java prg/Java-program/java Program/Logic_Program/FilePrgoram/test.text")) {
            myWriter.write("Harish1 10\nHello Welcome File, is return");
        }
        File fs=new File("D:/java prg/Java-program/java Program/Logic_Program/FilePrgoram/test.text");
        Scanner sc=new Scanner(fs);
        int count=0;
        String line="";
        while(sc.hasNextLine()){
            line=sc.nextLine();
            String line2[]=line.split(" ");
            System.out.println(Arrays.toString(line2));
            for(int i=0;i<line2.length;i++){
                // System.out.println(line2[i].length());
            for(int j=0;j<line2[i].length();j++){
              if((line2[i].charAt(j)>'a' && line2[i].charAt(j)<'z') || (line2[i].charAt(j)>'A' && line2[j].charAt(j)<'Z')){
                    //  System.out.println(line2[i].charAt(j));
                     count++;
                 }
            }
        }
    }
    System.out.println(count);
}
}