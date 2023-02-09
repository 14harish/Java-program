import java.util.ArrayList;

public class removing_N_digit_from_Integer{
    public static void main(String args[]){
        String str="Hello welc to ewKSR Collegew Tiruchengode";
        String con="_wKS_";
        String[] arr=str.split(" ");
        int per=con.indexOf("%");
        int n=0;
        if(con.charAt(0)=='%' && con.charAt(con.length()-1)=='%'){
            n=1;
        }else if(con.charAt(con.length()-1)=='%'){
            n=2;
        }else{
            n=0;
        }
        int dash=con.indexOf("_");
        ArrayList<String> a=new ArrayList<>();
        if(per!=-1){
            System.out.println(n);
            String s=con.replaceAll("%", "");
            for(int i=0;i<arr.length;i++){
               if(n==1){
                if(arr[i].contains(s) && arr[i].charAt(0)!=s.charAt(0) && arr[i].charAt(arr[i].length()-1)!=s.charAt(s.length()-1)){
                    a.add(arr[i]);
                }
               }
               else if(n==2){
                 int index=arr[i].indexOf(s);
                 if(index==(arr[i].length()-s.length())){
                    a.add(arr[i]);
                 }
               }else{
                  if(arr[i].contains(s)){
                    if(arr[i].charAt(0)==s.charAt(0) && arr[i].length()>s.length()){
                        a.add(arr[i]);                       
                    }
                  }               
               }
            }
        }
        else if(dash!=-1){
         for(int i=0;i<arr.length;i++){
            String s=con.replaceAll("_", "");
            if(arr[i].length()==con.length()){
                if(con.charAt(0)!='_'){
                    String v=arr[i].substring(0, s.length());
                    if(v.equals(s)){
                        a.add(arr[i]);
                    }
                }else{
                    int q=arr[i].indexOf(s);
                    // System.out.println(q);
                    String v="";
                    if(q!=-1){
                      v=arr[i].substring(q, s.length()+1);
                    System.out.println(v);
                    System.out.println(v+"=="+arr[i]);
                    int index=arr[i].indexOf(v);
                    System.out.println(index+"=="+con.indexOf(v));
                    if(index==con.indexOf(v)){
                        a.add(arr[i]);
                    }
                }
                }
            }
        }
        }
        System.out.println(a);
    }
}