public class boat {
    public static void main(String[] args) {
        int arr[]={1,2,2,1,3};
        int limit=3;
        ArrayList a=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            int sum=0;
            ArrayList<Integer> a1=new ArrayList<>();
            for(int j=i;j<arr.length;j++){
                if(arr[j]!=-1){
                    sum+=arr[j];
                    if(sum<=limit){
                      a1.add(arr[j]);
                      arr[j]=-1;
                    }
                      if(sum==limit){
                        break;
                    }
                    }
                }
              if(a1.size()!=0){
                a.add(a1);
              }
            }
        System.out.println(a);
        }
}
