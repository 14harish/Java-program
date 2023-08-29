package SingleyLinkedList;

public class SingleLinkedListClass {
    int len=0;
    node head;
    SingleLinkedListClass(){
        head=null;
    }
    class node{   //Node Structure
        int data;
        node next;
        node(int val){
            data=val;
            next=null;
        }
    }
    //Inserting value in the Beginning
    void insertAtBeginning(int val){
        node newNode=new node(val);
        if(head==null) {  //When list is empty
            head = newNode;
            len++;
            return;
        }
        else{   //When List Have values
            newNode.next=head;
            head=newNode;
            len++;
        }
    }
    //Inserting at a Position
    void insertAtPosition(int pos,int val){
        if (pos==0){
            insertAtBeginning(val);
            return;
        }
        if(pos==len){
            insertAtEnd(val);
            return;
        }
        node temp=head;
        node newNode=new node(val);
        for(int i=1;i<pos;i++) {
            temp = temp.next;
            if (temp==null)
                throw new IndexOutOfBoundsException("Invalid Position "+pos);
        }
        newNode.next=temp.next;
        temp.next=newNode;
        len++;
    }
    //Insert at end
    void insertAtEnd(int val){

        node temp=head;
        node newNode=new node(val);
        if(head==null){
            head=newNode;
            return;
        }
        for(int i=1;i<len;i++)
            temp=temp.next;
        temp.next=newNode;
        len++;
    }
    //Deleting First
    void deleteAtFirst(){
        if(head==null) return;
        if(head!=null) {
            head = head.next;
            len--;
        }
    }
    //Deleting at Position
    void deleteAtPosition(int pos){
        if(pos>len)
            throw new IndexOutOfBoundsException("Invalid Position "+pos);
        if(pos==0){
            deleteAtFirst();
            return;
        }
        if(pos==len){
            deleteAtLast();
            return;
        }
        node temp=head;
        for(int i=1;i<pos;i++)
            temp=temp.next;
        node pre=temp.next;
        temp.next=pre.next;
        len--;
    }
    //Deleting Last
    void deleteAtLast(){
        if(head==null) return;
        if(head.next==null){
            head=null;
            return;
        }
        node temp=head;
        for(int i=1;i<len-1;i++)
            temp=temp.next;
        temp.next=null;
        len--;
    }
    //Displaying the Values in the list
    void display(){
        node temp=head;
        while(temp !=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print("\nLength of the list "+len);
    }
    //DisplayReverse
    void reverse(){
        node prev=null;
        node cur=head;
        node nxt=cur.next;
        while (cur!=null){
            nxt=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nxt;
        }
        head=prev;
        display();
    }
    //empty
    void empty(){
        head=null;
        len=0;
    }
}


