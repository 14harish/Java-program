public class Fiboo {
    static int arr[]=new int[10];
    public static int fib(int x){
        // arr[0]=0;arr[1]=1;
        // for(int i=2;i<10;i++){
        //     arr[i]=arr[i-1]+arr[i-2];
        // }
        if(arr[x]==0){
        if(x<=1){
            arr[x]=x;
        }else{
            arr[x]=fib(x-1) + fib(x-2);
        }
    }
        return arr;
    }
    public static void main(String[] args) {
        int n=5;
        arr=fib(n);
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }
    }
}
