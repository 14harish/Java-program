public class longest_substring_without_repeating_characters {
    public static void main(String[] args) {
        String n="GEEKSFORGAKS";
        String check="";
        int start=0,count=0;
        for(int i=0;i<n.length();i++){
            check=n.substring(start, i);
            String s=n.charAt(i)+"";
            if(check.contains(s)){
                // System.out.println(i);
                //  System.out.println(check+" "+check.length());
                if(check.length()>count){
                    count=check.length();
                }
                check="";
                start=i;
            }
        }
        System.out.println(count);
    }
}
