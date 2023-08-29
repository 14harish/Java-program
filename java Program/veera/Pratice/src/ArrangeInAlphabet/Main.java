/*Shorting the Given String array in  Alphabetical order
And printing it with the respective Gender*/

package ArrangeInAlphabet;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        sc.nextLine();
        String[] name=new String[num];
        String[] gender=new String[num];
        for(int i=0;i<num;i++){
            name[i]=sc.nextLine();
            gender[i]=sc.nextLine();
        }
        for(int i=0;i<num;i++){
            for(int j=i+1;j<num;j++){
                if(name[i].compareToIgnoreCase(name[j])>0){
                    String temp=name[i];
                    name[i]=name[j];
                    name[j]=temp;
                    //Gender
                    String tempg=gender[i];
                    gender[i]=gender[j];
                    gender[j]=tempg;
                }
            }
        }
        for(int i=0;i<num;i++){
            System.out.println(name[i]+" - "+gender[i]);
        }
    }
}
/*
9
Ramasamy k
Male
Mahesh S
Male
Kumar S
Male
Charles B
Male
Parvathi M
Female
Cindrela U
Female
Ramesh K
Male
Gomathi S
Female
Balan N
Male
*/