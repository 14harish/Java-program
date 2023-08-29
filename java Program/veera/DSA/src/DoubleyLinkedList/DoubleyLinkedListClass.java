package DoubleyLinkedList;

public class DoubleyLinkedListClass {
    node head,tail;
    int len=0;
    class node{
        int data;
        node prev,next;
        node(int val){
            data=val;
            prev=null;
            next=null;
        }
    }
    DoubleyLinkedListClass(){
        head=null;
        tail=null;
    }
    //Insert At Begining
    void insertAtBegining(int data){
        node newNode=new node(data);
        len++;
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            head.prev=newNode;
            newNode.next=head;
            head=newNode;
        }
    }
    //Insert with Position
    void insertAtPosition(int pos,int val){
        if(pos==0){
            insertAtBegining(val);
            return;
        }
        if(pos==len){
            insertAtEnd(val);
            return;
        }
        node newNode=new node(val);
        node temp=head;
        for(int i=1;i<pos;i++) {
            temp = temp.next;
            if (temp==null) throw new IndexOutOfBoundsException("Invalid Position "+pos);
        }
        node reserve=temp.next;
        newNode.next=temp.next;
        temp.next=newNode;
        newNode.prev=reserve.prev;
        reserve.prev=newNode;
        len++;
    }
    //insert At end
    void insertAtEnd(int val){
//        node temp=tail;
        if(head==null){
            insertAtBegining(val);
            return;
        }
        node newNode= new node(val);
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
        len++;
    }
    //delete at first
    void deleteAtFirst(){
        if(head==null) return;
        head = head.next;
        head.prev = null;
        len--;
    }
    //delete at position
    void deleteAtPosition(int pos){
        if(pos==0){
            deleteAtFirst();
            return;
        }
        if(pos==len-1){
            deleteAtLast();
            return;
        }
        node temp=head;
        node reserve;
        for(int i=1;i<pos;i++) {
            temp = temp.next;
            if(temp==null) throw new IndexOutOfBoundsException("Invalid position "+pos);
        }
        reserve=temp.next;
        temp.next=reserve.next;
        reserve.prev=temp;
        len--;
    }
    //delete at last
    void deleteAtLast(){
        if(head==null){
            tail=null;
            return;
        }
        tail=tail.prev;
        tail.next=null;
        len--;
    }
    //empty
    void empty(){
        head=null;
        tail=null;
        len=0;
    }
    //Display List
    void display(){
        node temp=head;
        while(temp !=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("\nLength of the list "+len);
    }
    //Reverse list
    void reverse(){
        node temp=tail;
        while (temp !=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
    }
}
