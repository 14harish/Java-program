class stack{
    int top;
    int arr[]=new int[2];
    stack(){
        top=-1;
    }
    boolean isfull(){
     if(top==arr.length-1){
        return true;
     }   
     else{
        return false;
     }
    }
    boolean ifEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    void push(int element){
        if(isfull()){
            System.out.println("Stack is Full");
        }
        else{
            top++;
            arr[top]=element;
        }
    }
    void pop(){
        if(ifEmpty()){
            System.out.println("Stack is Empty");
        }
        else{
            top--;
        }
    }
    void display(){
        for(int i=0;i<=top;i++){
            System.out.println(arr[i]);
        }
    }
}
public class ArrStackImplementation {
    public static void main(String[] args) {
        stack s=new stack();
        s.push(10);
        s.push(20);
        //s.display();
        s.pop();
        s.push(110);
        s.push(220);
        s.display();
    }
}
