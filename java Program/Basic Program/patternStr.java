public class patternStr{
  public static void main(String[] args) {
    String name="harish";
    StringBuffer sc=new StringBuffer(name);
    int k=0;
    for(int i=0;i<name.length();i++){
        for(int j=0;j<i;j++){
            System.out.print(sc.charAt(j));
            sc.deleteCharAt(j);
        }
        System.out.println();
    }
  }  
}