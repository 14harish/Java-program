import java.util.Arrays;import java.text.SimpleDateFormat;import java.util.Date;

class Test {
        public static void main(String args[]) {
        int x = -4;
        System.out.println(x>>1);
        int y = 4;
        System.out.println(y>>2);
        char s='a';
        String sv=String.valueOf(s);
        System.out.println(sv);
        int arr[]={10,20,30,40,50};
        Arrays.toString(arr);
        String na="harish";
        String ne="HArish";
        System.out.println(na.equalsIgnoreCase(ne));
        // System.currentTimeMillis();
        Date d=new Date(System.currentTimeMillis());
        SimpleDateFormat d1=new SimpleDateFormat("yyyy/MM/dd");
       String currdate= d1.format(d);
       System.out.println(currdate);
  
        // System.out.println(arr);
        }
        }