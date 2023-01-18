import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DateOfBirthFinder28 {
    public static String output1;
  public static void main(String[]args){
      ArrayList<Integer> arrList=new ArrayList<Integer>();
      arrList.add(0);
      arrList.add(8);
      arrList.add(6);
      dateOfBirthFinder(arrList);
      System.out.println(output1);

  }
  public static void  dateOfBirthFinder(ArrayList<Integer> arrList) {
      int arr[]=new int[arrList.size()];
      Date d=new Date(System.currentTimeMillis());
      SimpleDateFormat d1=new SimpleDateFormat("yyyy/MM/dd");
     String currdate= d1.format(d);
     String []date=currdate.split("/");
     String[] mon={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
     int date1[]=new int[date.length];
     int year=0;
     int month=0;
     int birthdate=0;
     int noofdays=0;
     String res;
     for(int i=0;i<date.length;i++){
         date1[i]=Integer.parseInt(date[i]);
        //  System.out.println(date[i]);
     }
      for(int i=0;i<arrList.size();i++){
          arr[i]=arrList.get(i);  
      }
          year=date1[0]-arr[0];
        //   System.out.println(year);
          if(date1[2]<arr[2]){
              month=date1[1]-arr[1]-1;
              System.out.println(month);
          }else{
              month=date1[1]-arr[1];
              System.out.println("hai"+month);
          }
          if(arr[2]<=date1[2]){
          birthdate=date1[2]-arr[2]+1;
          System.out.println(Math.abs(birthdate));
          }
          else{
              noofdays=arr[2]-date1[2];
              System.out.println(noofdays);
              if(month==4||month==6||month==9||month==11){
                  birthdate=30-noofdays;
              }
              else if(month==2&&year%4==0){
                  birthdate=29-noofdays;
              }
              else if(month==2&&year%4!=0){
                  birthdate=28-noofdays;
              }else{
                  birthdate=31-noofdays;
                  System.out.println(birthdate);
              }
          }
         // SimpleDateFormat sd=new SimpleDateFormat("MMM");
          //SimpleDateFormat sd1=new SimpleDateFormat("dd");
          String dt="";
          if(!(birthdate>9)){
              dt="0"+String.valueOf(birthdate);
          }else{
              dt=String.valueOf(birthdate);
          }
          res=dt+"/"+mon[month-1]+"/"+String.valueOf(year);
      output1="";
      output1=res;
  }
}