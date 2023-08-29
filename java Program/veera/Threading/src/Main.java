class thread extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
            try {
                thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class thread1 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Data updated!");
            try {
                thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        thread obj=new thread();
        thread1 obj1=new thread1();
        obj.start();
        obj1.start();
        obj.join();
        obj1.join();
        System.out.println("Thread has been Ended!!");
    }
}