
public class subsequence_sf_Strings {
    public static void main(String[] args) {
        String s="geeksforgeek";
        String arr[]={"gg","gro","gfg","orf"};
        for(int i=0;i<arr.length;i++){
            System.out.println(check(arr[i], s));
        }
    }
    public static boolean check(String a,String s){
        boolean che=true;
        for(int i=0;i<a.length();i++){
                if(s.contains(a.charAt(i)+"")){
                     s=s.substring(s.indexOf(a.charAt(i))+1, s.length());
                     che=true;
                }
                else{
                    che=false;
                    break;
                }
            } 
            if(che){
               return true;
            }else{
               return false;
            }   
        }   
    }    
