public class AddingTwoValueInArrayEqualToKey {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,10};
        int key=10;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==key){
                    System.out.println(arr[i]+"+"+arr[j]+"="+key);
                }
            }
        }
    }
}
