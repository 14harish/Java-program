
public class change_string_to_a_new_character_set {
    public static void main(String[] args) {
        String check="qwertyuiopasdfghjklzxcvbnm";
        String alpha="abcdefghijklmnopqrstuvwxyz";
        String input="egrt";
        System.out.println();
        for(int i=0;i<input.length();i++){
            for(int j=0;j<check.length();j++){
                if(input.charAt(i)==check.charAt(j)){  
                    System.out.print(alpha.charAt(j));                    
                }
            }
    }
    }    
}
