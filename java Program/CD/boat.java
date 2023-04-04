public class boat {
    public static void main(String[] args) {
        int arr[]=[1,2,3,4,2,5,6];
        int limit=6;
        ArrayList a=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]!=-1){
                    sum+=arr[j];
                }
            }
            a.add(sum);
        }
        System.out.println(a);
    }   

}
