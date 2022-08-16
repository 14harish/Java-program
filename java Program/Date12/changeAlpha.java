
public class changeAlpha {
public static void main(String[] args) {
	String name="harisz";
	char[] dup=new char[name.length()];
	String vowel="aeiouAEIOU";
	int pos=0;
	for(int i=0;i<name.length();i++) {
	    for(int j=0;j<vowel.length();j++) {
		pos=name.charAt(i)+1;
		if(pos==91 || pos==123){
			pos=pos-26;
		}
	    if(vowel.contains(name.charAt(i)+"")) {
	    	dup[i]=name.charAt(i);
	    }
	    else {
	    	 dup[i]=(char)pos;
	    }
	}
	}
	for(int i=0;i<dup.length;i++) {
		System.out.println(dup[i]);
	}
}
}
