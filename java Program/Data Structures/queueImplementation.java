import java.util.NoSuchElementException;

public class queueImplementation {
    private node front;
    private node rear;
    private int length;
    public queueImplementation(){
        this.front=null;
        this.rear=null;
        this.length=0;
    }
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void length(){
        System.out.println("\n"+"Length :"+length) ;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void enqueue(int data){
        node temp=new node(data);
        if(isEmpty()){
            front=temp; //if it is empty then directly assign to the front
        }
        else{
            rear.next=temp; //if it has element then that temp should be next to alredy there element
        }
        rear=temp; //always inserting element should rear because it has to removed first
        length++;
    }
    public void display(){
        node temp=front;
        System.out.println();
        while(temp!=null){
            System.out.print(temp.data+"|");
            temp=temp.next;
        }
        System.out.println();
    }
    public void top(){
        System.out.println("\n"+"Top Element:"+front.data);
    }
    public void bottom(){
        System.out.println("\n"+"Bottom Element:"+rear.data);
    }
    public void dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is Empty");
        }
        int result=front.data; //this is used for Display the which element is deleted
        front=front.next; //this is used point another element break the chain
        if(front==null){
            rear=null;
        }
        length++;
    }
    public static void main(String[] args) {
        queueImplementation q=new queueImplementation();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display();
        q.length();
        q.dequeue();
        q.display();
        q.dequeue();
        q.display();
        q.top();
        q.bottom();
    }
}
