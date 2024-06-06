import java.util.EmptyStackException;

public class StackImplementation {
    private node top;
    private int length;

    private class node {
        private int data;
        private node next;

        public node(int data) {
            this.data = data;
        }
    }

    public StackImplementation() {
        top = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void push(int data) {
        node temp = new node(data);
        temp.next = top; //assinging link as top address 
        top = temp; //assigning top to new data
        length++;
        System.out.println("Pushed Element:" + temp.data);
    }

    public void peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        System.out.println("Top of the Element :" + top.data);
    }

    public void pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next; //this will point next data as top and removing it
        length--;
        System.out.println("Poped Element:" + result);
    }

    public void display() {
        node temp = top;
        while (temp != null) {
            System.out.println("|" + temp.data + "|");
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {
        StackImplementation s = new StackImplementation();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.length();
        s.peek();
        s.pop();
        s.peek();

    }
}
