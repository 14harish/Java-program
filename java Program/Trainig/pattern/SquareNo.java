package Trainig.pattern;

public class SquareNo {
    public static void main(String[] args) {
        int n=2;
        int val1=n;
        for(int i=0;i<n*2-1;i++,System.out.println()){
            int r=(i<n) ? i : (n*2)-i-2;
            for(int j=0;j<n*2-1;j++){
                int col=(j<n) ? j : (n*2)-j-2 ; 
                int min=r<col ? r : col; //finding minimum
                System.out.print(val1-min+" ");
            }
        }
        
    }
    
}
