
public class xylemAndPholemNum {
    public static void main(String[] args) {
        int n=17156;
        char[] arr=(n+"").toCharArray();
        int sum1=0,sum2=0;
        for(int i=0;i<arr.length;i++){
            if(i==0 || i==arr.length-1){
                sum1+=arr[i]-'0';
            }else{
                sum2+=arr[i]-'0';
            }
        }
        System.out.println(sum1+" "+sum2);
        System.out.println(sum1==sum2?"xylem":"pholem");
    }
}
