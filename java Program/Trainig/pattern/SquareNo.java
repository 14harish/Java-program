package Trainig.pattern;

public class SquareNo {
    public static void main(String[] args) {
        int n=4;
        int val1=n;
        int val2=n;
        int val3=n;
        int val4=n;

        for(int i=0;i<n*2-1;i++,System.out.println()){
            for(int j=0;j<n*2-1;j++){
                int r=(i<n) ? i : (n*2)-i ;
                int min=r<j ? r :j;
                System.out.print(val1-min+" ");
            }
        }
        
    }
    
}
