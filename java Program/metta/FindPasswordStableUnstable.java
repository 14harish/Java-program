package metta;

import java.util.ArrayList;
import java.util.HashSet;

public class FindPasswordStableUnstable {
    public static void main(String[] args) {
    int a=12,b=1313,c=122,d=678,e=898;
    int sumStable=0,sumUnstable=0;
    ArrayList<Integer> ac=new ArrayList<>();
    ac.add(a);
    ac.add(b);
    ac.add(c);
    ac.add(d);
    ac.add(e);
  //  System.out.println(ac);
  //  System.out.println(checkStable(e));
    for(int i=0;i<ac.size();i++){
        if(checkStable(ac.get(i))){
            //System.out.println(ac.get(i));
            sumStable+=ac.get(i);
        }
        else{
           // System.out.println(ac.get(i));
            sumUnstable+=ac.get(i);
        }
    }
    System.out.println(sumStable);
    System.out.println("Password:"+(sumStable-sumUnstable));
    }
    public static boolean checkStable(int b){
       StringBuffer sc=new StringBuffer(b+"");
       ArrayList<Integer> a=new ArrayList<>(); 
       //    System.out.println(sc.length());
       int count=0;
        for(int i=0;i<sc.length();i++){
            count=1;
            for(int j=i+1;j<sc.length();j++){
                if(sc.charAt(i)==sc.charAt(j)){
                    count++;
                    sc.replace(j, j+1, "0");
                }
            }
            if(sc.charAt(i)!='0'){
                a.add(count);
            }
        }
        //System.out.println(a);
        HashSet<Integer> h=new HashSet<>(a);
        if(h.size()==1){
            return true;
        }
        else{
            return false;
        }
    }
}
