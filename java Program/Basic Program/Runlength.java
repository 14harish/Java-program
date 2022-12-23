


public class Runlength {
    public static void main(String[] args) {
        StringBuffer sc=new StringBuffer();
        String n="wwwwaaadexxxxxx";
        char[] s=n.toCharArray();
        int arr[]=new int[s.length];
        int count=0,x=0;
        char d=0;
        for(int i=0;i<s.length;i++){
            count=1;
            for(int j=i+1;j<s.length;j++){
                if(s[i]==s[j]){
                    count++;
                    arr[j]=-1;
                }
            }
            if(arr[i]!=-1){
                arr[i]=count;
            }
        }
        
        for(int i=0;i<s.length;i++){
         if(arr[i]!=-1){
            sc.append(s[i]);
            sc.append(arr[i]);
         }       
        }
        System.out.println(sc);
    }
}
