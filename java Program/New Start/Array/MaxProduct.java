public class MaxProduct {
    public static void main(String[] args) {
        int arr[]={6,-3,-10,0,2};
        int n=arr.length;
        long max=arr[0],pre=1,suf=1;
        for(int i=0,j=n-1;i<n;i++,j--){
            if(pre==0) pre=1;
            if(suf==0) suf=1;
            pre*=arr[i];
            suf*=arr[j];
            max=Math.max(max,Math.max(pre,suf));
        }
        System.out.println(max);
    }
}
