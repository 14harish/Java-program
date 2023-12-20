public class rotateBy1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int new1 = arr[n-1]; 
        for(int i=(n-2); i>=0; i--) {
            arr[i+1] = arr[i]; 
        }
        arr[0] = new1; 
    //     int s=a.pop();
    //  a.insertElementAt(s,0);
    }
}
