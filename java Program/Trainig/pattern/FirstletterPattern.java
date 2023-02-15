package Trainig.pattern;

public class FirstletterPattern {
    public static void main(String[] args) {
        int n = 5;

        //H
        for (int i = 0; i < n; i++, System.out.println()) {
            for (int j = 0; j < n; j++) {
                if (i == n / 2) {
                    System.out.print("* ");
                } else if ((j == 0 || j == n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
        }
        System.out.println();
        //A
        for (int i = 0; i < n; i++, System.out.println()) {
            for (int j = 0; j < n; j++) {
                if (i == n / 2) {
                    System.out.print("* ");
                } else if ((j == 0 || i == 0 || j == n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
        }
        System.out.println();
        // R
        for (int i = 0; i < n; i++, System.out.println()) {
            for (int j = 0; j < n; j++) {
                if (i == n / 2) {
                    System.out.print("* ");
                } else if ((j == 0 || i == 0 || (j == n - 1 && i < n / 2))) {
                    System.out.print("* ");
                } else if (i > n / 2) {
                    if (i == j) {
                        System.out.print("* ");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
        }
        System.out.println();
        
        // I
        for (int i = 0; i < n; i++, System.out.println()) {
            for (int j = 0; j < n; j++) {
                if (j == n/2) {
                    System.out.print("* ");
                } else if (i == 0 || i==n-1) {
                    System.out.print("* ");
                } 
                else {
                    System.out.print("  ");
                }
            }
        }

        System.out.println();
        
        //S 
        for (int i = 0; i < n; i++, System.out.println()) {
            for (int j = 0; j < n; j++) {
                if ((j == 0 && i<n/2) || i==n/2 || (j==n-1 && i>n/2 )) {
                    System.out.print("* ");
                } else if (i == 0 || i==n-1) {
                    System.out.print("* ");
                } 
                else {
                    System.out.print("  ");
                }
            }
        }
        System.out.println();
        // H
        for (int i = 0; i < n; i++, System.out.println()) {
            for (int j = 0; j < n; j++) {
                if (i == n / 2) {
                    System.out.print("* ");
                } else if ((j == 0 || j == n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
        }
        
        // .
        System.out.println();
        for(int i=0;i<n;i++,System.out.println()){
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1 ||i==0 ||i==n-1){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
        }

        System.out.println();
        // V
        for(int i=n-1;i>=0;i--,System.out.println()){
            for(int s=0;s<=n-i-2;s++){
                System.out.print("  ");
            }
            for(int j=0;j<=i+n;j++){;
                if((j==0 || j==i*2)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
        }
    }
}
