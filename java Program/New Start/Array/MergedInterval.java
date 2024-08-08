import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergedInterval {
    public static void main(String[] args) {
        int[][] arr = {{1,3}, {2,6}, {15, 18},{8,10}};
        int n=arr.length;
         Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            int start=arr[i][0];
            int end=arr[i][1];
            if(!ans.isEmpty() && end<=ans.get(ans.size()-1).get(1)) continue; //end wwill laise inside we dont need to change anythinf checking current last element and merged arraylist last element 
            System.out.println(start+","+end);
            for(int j=i+1;j<n;j++){
                System.out.println(arr[j][0]+"----"+end+"---"+arr[j][1]);
                if(arr[j][0] <=end){ //checking arr[i] last element and arr[j] first element
                    end=Math.max(end,arr[j][1]);  //keep the maximum element 
                }else{
                    break;
                }
            }
            System.out.println(start+","+end);

            ans.add(Arrays.asList(start,end));
        }
        System.out.println(ans);
        int a[][]=new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(i).size();j++){
                System.out.println(ans.get(i).get(j));
                a[i][j]=ans.get(i).get(j);  
            }
        }
        // System.out.println(a);
    }
}
