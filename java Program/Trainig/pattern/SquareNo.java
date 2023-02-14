package Trainig.pattern;

public class SquareNo {
    public static void main(String[] args) {
        int n=4;
        int val=0;
        for(int i=0;i<n*2;i++,System.out.println()){
            for(int j=0;j<n*2;j++){
                System.out.print(val);
            }
            val++;
        }
    }
    
}
