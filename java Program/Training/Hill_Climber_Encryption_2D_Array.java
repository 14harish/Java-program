package Training;

public class Hill_Climber_Encryption_2D_Array {
    public static void main(String[] args) {
        String in="ACT";
        String key="GYBNQKURP";
        int k=0,v=0;
        int sum=0;
        int d[][]=new int[in.length()][in.length()];
        int a[]=new int[in.length()];
        int mul[]=new int[in.length()];
        for(int i=0;i<3;i++) {
            a[i]=in.charAt(i)-'A';
        for(int j=0;j<3;j++) {
            d[i][j]= key.charAt(k)-'A';
            k++;
        }
        }
        
        for(int i=0;i<a.length;i++) {
            sum=0;
            for(int j=0;j<a.length;j++) {
                for(int p=0;p<a.length;p++) {
                    System.out.println(d[j][i]+"*"+a[p]);
                        sum+=d[i][j]*a[p];
                    }
            }
                 System.out.println(sum);
                 mul[i]=sum;
            }
        //diplay(d,key);
        for(int i=0;i<a.length;i++) {
            System.out.println(mul[i]);
         }
        }
        static void diplay(int d[][],String key){
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(d[i][j]+" ");
            }System.out.println();
          }
        }
        }
