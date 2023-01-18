public class characters_coming_on_only_one_of_two_String{
    public static void main(String[] args) {
        String in1="AFAAW";
        String in2="BGFFB";
        in1=removeDup(in1);
        in2=removeDup(in2);
        String com=in1+in2;
        com=fin(com);
        System.out.println(com);
    }
    static String removeDup(String str1) {
        char s1[]=str1.toCharArray();
        StringBuffer sc=new StringBuffer();
        int[] arr=new int[s1.length];
        for(int i=0;i<s1.length;i++){
        for(int j=i+1;j<str1.length();j++){
        if(s1[i]==s1[j]){
            arr[j]=-1;
        }
        }
        if(arr[i]!=-1){
            sc.append(s1[i]);
        }
        }
            String str=sc.toString();
            return str;
        }
        public static String fin(String str1){
            char s1[]=str1.toCharArray();
            StringBuffer sc=new StringBuffer();
            int[] arr=new int[s1.length];
            for(int i=0;i<s1.length;i++){
            for(int j=i+1;j<str1.length();j++){
            if(s1[i]==s1[j]){
                arr[i]=-1;
                arr[j]=-1;
             }
          }
            if(arr[i]!=-1){
                sc.append(s1[i]);
            }
        }
            String str=sc.toString();
            return str;
        }
    }