import java.util.HashSet;

public class program_to_remove_last_occurrence_of_character_from_the_string {
    public static void main(String[] args) {
        String inp="I love programming. I love Codeforwin I basdjksahdkj Iasbfdjk";
        char a='I';
        int index=0;
        StringBuffer sc=new StringBuffer(inp);
        for(int i=0;i<inp.length();i++){
            if(inp.charAt(i)==a){
                index=i;
            }
        }
        sc.replace(index, index+1, "");
        System.out.println(sc);
        HashSet <Integer> s=new HashSet<>();
    }
}
