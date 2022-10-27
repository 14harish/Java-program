import javax.lang.model.element.Element;

class queue{
    int arr[]=new int[2];
    int front,rear;
    queue(){
         front=-1;
         rear=-1;
    }
   boolean isfull(){
        if(front==0 && rear==arr.length-1){
            return true;
        }
        else{
            return false;
        }
    }
    boolean isEmpty(){
        if(front==-1 && rear==-1){
            return true;
        }
        else{
            return false;
        }
    }
    void enqueue(int element){
        if(isfull()){
            System.out.println("queue is Full");
        }
        else{
            if(front==-1){
                front=0;
            }
            rear++;
            arr[rear]=element;
        }
    }
    void dequeue(){
        int element;
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        else{
            if(front==rear){
                front=front-1;
                rear=rear-1;
            }
            else{
            front=front+1;
            }
        }
    }
    void display(){
        for(int i=front;i<=rear;i++){
            System.out.println(arr[i]);
        }
    }
}
public class ArrqueueImplement {
    public static void main(String[] args) {
        queue q=new queue();
        q.enqueue(10);
        q.enqueue(20);
    //    q.display();
        q.dequeue();
        q.enqueue(30);
        q.display();
    }
}
