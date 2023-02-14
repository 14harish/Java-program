package Trainig.pattern;

public class FirstletterPattern {
    public static void main(String[] args) {
        int n = 5;
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
        for(int i=n-1;i>=0;i--,System.out.println()){
            for(int j=0;j<=i+n;j++){
                if(j>(n-i)-1 && j!=0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
        }
    }
}
