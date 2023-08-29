import java.util.Scanner;
public class Main {
    static void choise(){
        System.out.println("Select your Choise!!");
        System.out.println("1.For Stone");
        System.out.println("2.For Papper");
        System.out.println("3.For Scissors");
        System.out.println("0.For Exit!!");
    }
    static int opponent(){
        int random= (int) Math.floor(Math.random()*3)+1;
        return random;
    }
    static String oppoChoise(int i){
        String arr[]={"Stone","Paper","Sissors"};
        return arr[i];
    }
    static boolean stone(int play,int oppo){
        if(oppo==2) return false;
        else return true;
    }
    static boolean papper(int play,int oppo){
        if(oppo==3) return false;
        else return true;
    }
    static boolean scissors(int play,int oppo){
        if(oppo==1) return false;
        else return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int player=1,oppo=0;
        int playSco=0,oppoSco=0;
        do{
            choise();
            player=sc.nextInt();
            if (player==0) break;
            oppo=opponent();
            System.out.println("Opponent Choise: "+ oppoChoise(oppo-1));

            if(player==oppo) //Draw
                System.out.println("The Match was Draw!!");
            else{
                switch (player){
                    case 1:
                        if(stone(player,oppo)){
                            playSco++;
                            System.out.println("You Won!!");
                        }
                        else{
                            oppoSco++;
                            System.out.println("Better Luck Next Time...");
                        }
                        break;
                    case 2:
                        if(papper(player,oppo)){
                            playSco++;
                            System.out.println("You Won!!");
                        }
                        else{
                            oppoSco++;
                            System.out.println("Better Luck Next Time...");
                        }
                        break;
                    case 3:
                        if(scissors(player,oppo)){
                            playSco++;
                            System.out.println("You Won!!");
                        }
                        else{
                            oppoSco++;
                            System.out.println("Better Luck Next Time...");
                        }
                        break;
                }
            }
        }while(player>=1 && player<=3);
        if(player==0){
            System.out.println("*******RESULT*******");
            System.out.print("Your Score: "+playSco+"\t Opponent Score: "+oppoSco);
            System.out.println("Thanks For Playing!!");
        }
        else if(player>0||player>=4){
            System.out.println("*******RESULT*******");
            System.out.print("Your Score: "+playSco+"\t Opponent Score: "+oppoSco);
            System.out.println("Invalid Choise!!");
        }
    }
}