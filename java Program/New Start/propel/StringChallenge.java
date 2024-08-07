import java.util.*;
import java.io.*;
class Main {
 public static String MinWindowSubstring(String[] strArr)
 {
 StringBuilder result = new StringBuilder(strArr[0]);
 StringBuilder temp = new StringBuilder();
 String n = strArr[0];
 List<String> kList = Arrays.asList(strArr[1].split(""));
 List<String> recordList = new ArrayList<>(kList);
//  System.out.println(kList);
//  System.out.println(recordList);
 for (int i = 0; i < n.length(); i++)
   {
   for (int j = i; j < n.length(); j++)
   {
    temp.append(n.substring(j,j+1));
    System.out.println(temp+"--- temp");
   if (recordList.contains(n.substring(j,j+1)))
   {
     recordList.remove(n.substring(j, j+1));
   }
   System.out.println(recordList+"---- RecordList");
   if(recordList.isEmpty())
   {
    if (temp.length() < result.length())
    {   
      result = new StringBuilder(temp.toString());
    }
     break;
   }
   System.out.println(result+"--- result");
 }
 //Reset string buffer and kSet
 System.out.println("-----------------------------------");
    temp.setLength(0);
    recordList.clear();
    recordList.addAll(kList);
 }
 return result.toString();
 }
 public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    String a[]={"ahffaksfajeeubsne", "jefaa"};
    System.out.print(MinWindowSubstring(a));
 }
}
