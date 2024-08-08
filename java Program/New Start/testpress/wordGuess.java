import java.util.Random;
import java.util.Scanner;

public class wordGuess {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What is your Name:");
        String name=sc.nextLine();
        System.out.println("Good Luck..."+name);

        // String word[]=[""]
        String[] words = {"rainbow", "computer", "science", "programming",
         "python", "mathematics", "player", "condition",
         "reverse", "water", "board", "geeks"};
        String word=words[new Random().nextInt(words.length)];

        System.out.println("Guess the Character");

        String Guesses="";

        int turns=12;

        while(turns>0){
            int falied=0;

            for(int i=0;i<word.length();i++){
                if(Guesses.contains(word.charAt(i)+"")){
                    System.out.println(word.charAt(i)+" ");
                }else{
                    System.out.println("_");
                    falied+=1;
                }
            }
            if(falied==0){
                System.out.println("You Win");
                System.out.println("The word is: "+word);
                break;
            }

            System.out.println("");
            char guess=sc.next().charAt(0);
            Guesses+=guess;
            System.out.println(falied+"---"+turns+"---");
            if(!word.contains(guess+"")){
                turns--;
                System.out.println("Wrong");
                System.out.println("You have"+turns+"more Guesses");
                if(turns==0){
                    System.out.println("failed");
                }
            }
        }

        // System.out.println(word);
    }    
}
