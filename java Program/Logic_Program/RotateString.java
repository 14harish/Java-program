public class RotateString {
    public static void main(String args[]){
    String val="geeks";
    String dup=val;
    String a="";
    // for(int i=1;i<5;i++){
    //     a=val.substring(1)+val.charAt(0);
    //     val=a;
    //     System.out.println(val);
    // }
    // System.out.println(val);
    int count=0;
    while(!(dup.equals(a))){
        a=val.substring(1)+val.charAt(0);
        val=a;
        count++;
    }
    System.out.println(count);
    }
}
