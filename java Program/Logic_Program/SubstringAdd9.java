public class SubstringAdd9 {
    public static void main(String[] args) {
        String a="999";
        int count=0;
        for(int i=0;i<a.length();i++){
            for(int j=i+1;j<=a.length();j++){
                int val=Integer.parseInt(a.substring(i, j));
                if(val%9==0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
