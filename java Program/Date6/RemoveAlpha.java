package Date6;

public class RemoveAlpha {
public static void main(String[] args) {
	String in="g+abc*tY-56";
	in=in.replaceAll("[a-z,A-Z]","");
	System.out.println(in);
}
}
