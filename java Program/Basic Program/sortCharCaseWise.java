public class sortCharCaseWise{
    public static void main(String[] args) {
        String word="KSRCollege";
        char[] w=word.toCharArray();
        char temp=0;
        for(int i=0;i<word.length();i++){
            for(int j=i+1;j<word.length();j++){
                if(w[i]>w[j]){
                    temp=w[i];
                    w[i]=w[j];
                    w[j]=temp;
                }
            }
        }
        String ne=String.valueOf(w);
        System.out.println(ne);
    }
}