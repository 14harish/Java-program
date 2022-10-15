package tenprogram;
import java.util.*;
public class passwordValidaton {
	 public static void main(String[] args) {
	        char Cs = 64, Cl = 91, cs = 96, cl = 123;
	        //System.out.println(c);
	        //v2aLi5D@p9asp
	        String name = "IsThisValidpassword1234$*";
	        char password[] = name.toCharArray();
	         //System.out.println(password[12]);
	        if (password.length <=8 && password.length>=28) {
	            System.out.println("Enter 8 Digit password !!!!");
	        } else {
	            if (Checkfirst(password, cs, cl, Cs, Cl)==true&&small(password,cs,cl)==true&&
	            	large(password,Cs,Cl)==true&&consective(password)==true&&Checklast(password)==true ) {
	                System.out.println("Valid");
	            }
	            else {
	            	System.out.println("not valid");
	            }
	           
	    }
	 }

	    static boolean Checkfirst(char[] password, char cs, char cl, char Cs, char Cl) {
	        //char cs=64,cl=91;
	        if (password[0] > cl && password[0] < cs && password[0] > Cs && password[0] < Cl) {
	            return false;
	        }
	        return true;
	    }
	    static boolean small(char[] password,char cs,char cl) {
	    	int count=0;
	    	for(int i=0;i<password.length;i++) {
	    		if (password[i] > cs && password[i] < cl) {
	    			count++;
	    		}
	    	}
	    	//System.out.println(count);
	    	if(count>=2) {
	    		return true;
	    	}
	    		return false;
	    }
	    static boolean large(char[] password,char Cs,char Cl) {
	    	int count=0;
	    	for(int i=0;i<password.length;i++) {
	    		if (password[i] > Cs && password[i] < Cl) {
	    			count++;
	    		}
	    	}
	    //	System.out.println(count);
	    	if(count>=1) {
	    		return true;
	    	}
	    		return false;
	    }
	    static boolean consective(char[] password) {
	    	int count=1;
	    	for(int i=0;i<password.length-1;i++) {
        		if(password[i]==password[i+1]) {
        			count++;	
        			}
        		}
	    	//System.out.println(count);
	    	if(count<3) {
	    		return true;
	    	}
	    	else {
	    		return false;
	    	}
	    }

	    static boolean Checklast(char[] password) {
	        char[] special = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')' };
	        int count=0;
	        char last=password[password.length-1];
	        //System.out.println(last);
	        for(int i=0;i<special.length;i++) {
	        	if(last==special[i]) {
	        		count++;
	        	}
	        }
	       // System.out.println(count);
	        if(count==1) {
	        	return true;
	        }
	        else {
	           return false;
	        }
	    }
	}
