public class Fiboo {
    static int arr[]=new int[10];
    public static int fib(int x){
        if(arr[x]==0){
         if(x<=1){
             arr[x]=x;
          }else{
             arr[x]= fib(x-1) + fib(x-2);
          }
    }
        return arr[x];
    }
//Memoniation
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<10;i++){
            arr[i]=fib(i);
        }
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }

    }
}
