
public class SingleLinkedList {
        public node head;
       private static class node{
            int data;
            node next;
            public node(int data){
                this.data=data;
                this.next=null;
            }
        }
        public static void main(String[] args) {
            SingleLinkedList sl=new SingleLinkedList();
            sl.head=new node(10);
            node second=new node(20);
            node third=new node(30);
            node fourth=new node(40);
    
            //Linking the four node using single linked list
            sl.head.next=second;
            second.next=third;
            third.next=fourth;
        }
    }
