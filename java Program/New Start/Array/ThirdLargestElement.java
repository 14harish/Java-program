public class ThirdLargestElement {
    public static void main(String[] args) {
        int a[]={10,22,12,34,90};
        int max=Integer.MIN_VALUE;
	    int smax=0,tmax=0;
	    for(int i=0;i<a.length;i++){
	        if(max<a[i]){
	            tmax=smax;
	            smax=max;
	            max=a[i];
	        }
            else if(smax<a[i] && max!=a[i]){
	            tmax=smax;
	            smax=a[i];
	        }
	        else if(tmax<a[i] && smax!=a[i]){
	            tmax=a[i];
	        }
	    }
        System.out.println(max+"--"+smax+"--"+tmax);
    }
}
