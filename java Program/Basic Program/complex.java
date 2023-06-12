
public class complex {
    public static void main(String[] args) {
        String n1="2.3+4.6i";
        String n2="1.2+2.1i";
        float arr[]=split(n1);
        float arr1[]=split(n2);
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr1[i]);
        // }
        float sum=arr[0]+arr1[0];
        float sum1=arr[1]+arr1[1];
         System.out.println("RealPart Sum:"+sum);
         System.out.println("ImaginerPart Sum:"+sum1);
    }
    static float[] split(String n){
        n=n.replace('i', '\0');
        String str[]=n.split("[+]");
        float arr[]=new float[str.length];
        for(int i=0;i<str.length;i++){
            arr[i]=Float.parseFloat(str[i]);
        }
        return arr;
    }
}
