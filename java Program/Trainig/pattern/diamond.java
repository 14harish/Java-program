package Trainig.pattern;

public class diamond {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n*2;i++,System.out.println()){
            int row= i<n ? i :(2*n)-i;
            for(int s=0;s<(n-row);s++){
                System.out.print(" ");
            }
            for(int j=0;j<row;j++){
               System.out.print("* ");
            }
        }
        System.out.println();

        for(int i=0;i<n*2;i++,System.out.println()){
            int row= i<n ? i :(n*2)-i;
            for(int j=0;j<row+n-1;j++){
                if(j>=(n-row)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
        }
    }
}
