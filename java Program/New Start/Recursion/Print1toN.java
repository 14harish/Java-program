
public class Print1toN {
public static void main(String[] args) {
    print(1, 10);
    System.err.println();
    reversePrint(10);
}
public static void print(int i,int N){
    if(i>N){
        return;
    }
    System.out.print(i+" ");
    print(i+1,N);
    
}    
public static void reversePrint(int N){
    if(N<=0){
        return;
    }
    System.out.print(N+" ");
    reversePrint(N-1);
}
}
