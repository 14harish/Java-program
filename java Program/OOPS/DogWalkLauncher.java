class dog{
    int time;
    void setDrinkTimer(int time){
        this.time=time;
    }
    int getDrinkTimer(){
        return time;
    }
    boolean needTogGo(){
        if(getDrinkTimer()>=4){
            return true;
        }else{
            return false;
        }
    }
}
class dogOwner{
    boolean takeToWalk(dog d){
        return d.needTogGo();
    }

}
public class DogWalkLauncher {
    public static void main(String[] args) {
        dog d=new dog();
        d.setDrinkTimer(3);   
        dogOwner o=new dogOwner();
        System.out.println(o.takeToWalk(d));
    }
}
