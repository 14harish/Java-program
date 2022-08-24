import java.util.*;
public class missingNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size:");
        int s=sc.nextInt();
        int arr[]=new int[s];
        ArrayList<Integer> g=new ArrayList<>();
        System.out.println("Enter the Elements");
        for(int i=0;i<s;i++) {
        arr[i]=sc.nextInt();
        g.add(arr[i]);
        }
        Arrays.sort(arr);
        Collections.sort(g);
        int diff=Math.abs(arr[0]-arr[1]);
        for(int i=0;i<arr.length-1;i++) {
        if(Math.abs(arr[i]-arr[i+1])==diff) {
        
        }
        else {
        g.add(i+1,arr[i]+diff);
        }
        }
        for (Integer integer : g) {
        System.out.println(integer);
        }
        }
        }        
