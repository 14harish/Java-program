import java.util.ArrayList;
import java.util.Arrays;

public class practise {
	public static void main(String[] args) {	
        int arr[]={1,2,3,4,5,6,7};
        String[] a={"Harish","deepak","hariharan"};
        ArrayList<String> n=new ArrayList<>(Arrays.asList(a));
        ArrayList<Integer> n1=new ArrayList<>();
        for(int i=0;i<4;i++){
            n1.add(i);
        }
        n.replaceAll(y->y.toUpperCase()); //using lamda function
        
        n1.forEach(System.out::println);
        n.forEach(System.out::println);
    }
}
