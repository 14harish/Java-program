import Practise.flames;

public class FindSubArray {
    public static void main(String[] args) {
        int a1[]={2,3,4,5,6};
        int a2[]={2,3,4};
        int count=0;
        for(int i=0;i<a1.length;i++){
            for(int j=0;j<a2.length;j++){
                if(a1[i]==a2[j]){
                    count++;
                }
            }
        }
        System.out.println(count==a2.length);
    }    
}
