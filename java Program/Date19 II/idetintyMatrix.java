public class idetintyMatrix {
    public static void main(String[] args) {
        int arr[][]={{1,0,0},{0,1,0},{0,0,1}};
        boolean check=true;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i][j]==0){
                    continue;
                }
                else if(i==j && arr[i][j]!=0){
                    continue;
                }
                else{
                    check=false;
                }
            
            }
        }
        System.out.println(check);
    }
}
