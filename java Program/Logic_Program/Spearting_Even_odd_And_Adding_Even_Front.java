import java.util.ArrayList;

public class Spearting_Even_odd_And_Adding_Even_Front {
    public static void main(String[] args) {
        int arr[]={20, 12, 23, 17, 7, 8, 10, 2, 1, 0};
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
        }
        even.addAll(odd);
        System.out.println(even);
    }
}
