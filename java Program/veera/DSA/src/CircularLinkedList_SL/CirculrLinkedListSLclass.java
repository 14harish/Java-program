package CircularLinkedList_SL;

import SingleyLinkedList.SingleLinkedListClass;

public class CirculrLinkedListSLclass {
    node last;
    int length=0;
    class node{
        int data;
        node next;
        node(int val){
            data=val;
            next=null;
        }
    }
    CirculrLinkedListSLclass(){
        last=null;
    }
    //insert At Beginning
    void insertAtBeginning(int val){
        node newNode=new node(val);
        if (last==null){
            newNode.next=newNode;
            last=newNode;
            length++;
        }
        else{
            newNode.next=last.next;
            last.next=newNode;
            length++;
        }
    }
    //Insert with position
    void insertAtPosition(int pos,int val){
        if(pos==0){
            insertAtBeginning(val);
            return;
        }
        if(pos==length){
            insertAtLast(val);
            return;
        }
        node newNode=new node(val);
        node temp=last.next;
        for(int i=1;i<pos;i++){
            temp=temp.next;
            if(temp==last) throw new IndexOutOfBoundsException("Invalid position: "+pos);
        }
        newNode.next=temp.next;
        temp.next=newNode;
        length++;
    }
    //Insert At last
    void insertAtLast(int val){
        node newNode=new node(val);
        if(last==null){
            insertAtBeginning(val);
            return;
        }
        newNode.next=last.next;
        last.next=newNode;
        last=newNode;
        length++;
    }
    //delete at first
    void deleteAtFirst(){
        if(last==null) return;
        if(length==1){
            last=null;
            return;
        }
        node temp=last.next;
        last.next=temp.next;
        length--;
    }
    //delete at lase
    void deleteAtLast(){
        if(last==null) return;
        if(length==1){
            last=null;
            return;
        }
        node temp=last;
        for(int i=1;i<length;i++)
            temp=temp.next;
        temp.next=last.next;
        last=temp;
        length--;
    }
    //delete with position
    void deleteWithPosition(int pos){
        if(pos==length-2){
            deleteAtLast();
            return;
        }
        if(pos==0){
            deleteAtFirst();
            return;
        }
        node temp=last.next;
        for(int i=1;i<pos;i++) {
            temp = temp.next;
            if(temp==last) throw new IndexOutOfBoundsException("Invalid Position: "+pos);
        }
        node reserve=temp.next;
        temp.next=reserve.next;
        length--;
    }
    //display
    void display(){
        node temp =last.next;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while(temp!=last.next);
        System.out.println("\nLength of the List :"+length);
    }
    //reverse the list Wont Eork
    void reverse() {
        if (last == null || last.next == last)
            // The list is empty or has only one node (already reversed)
            return;
        node current = last.next;
        node prev = null;
        node nextNode;
        do {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        } while (current != last.next);
        // After the reversal, update the "last" pointer to the new first node.
        last.next = prev;

        display();
    }

}
