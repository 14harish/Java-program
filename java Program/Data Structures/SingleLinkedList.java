
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
        public void display(){
            node temp=head; //Assinging Temp to head
            while(temp!=null){ //Till running till last node will be Null then it  will stop
                System.out.print(temp.data+"-->"); //printing the current value in data
                temp=temp.next; //and changing next value for the process
            }
            System.out.println("Null");
        }
        public void LengthOfList(){
            node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            System.out.println("Length Of the Linked List is:"+count);
        }
        public void insertAtbeg(int value){
            node beg=new node(value);
            beg.next=head;
            head=beg;
        }
        public void insertAtLast(int value){
            node last=new node(value);
            if(head==null){
                head=last;
            }
            else{
                node temp=head;
            while(null!=temp.next){  //This to travel last of the node
                temp=temp.next;
            }
            temp.next=last; //when we reach last node then assign in temp next address as last node address
            }
        }
        public void insertAtMiddle(int value,int pos){
            node mid=new node(value);
            if(pos==1){
                mid.next=head;
                head=mid;
            }
            else{
                node temp=head;
                int count=1;
                while(count<pos-1){  //this is to travel before node 
                    count++;
                    temp=temp.next;
                }
                node p=temp.next;  //we will store temp next address in another temp for without lossing the next data
                temp.next=mid;  //and we will assign the mid address to the next of the temp
                mid.next=p; //mid next address to the temp value that we stored of next to the temp valu\e
            }
        }
        public node delAtBeg(){ //if we give node then we should return null
            if(head==null){
                return null;
            }
            node temp=head; //taking head address to temp for acessing the next address of head
            head=head.next; //we were storing next node address to the head
            temp.next=null; //and we are break the linking of the temp node to head by declaring temp next to null
            return null;
        }
        public node delAtLast(){
            if(head==null){
                return null;
            }
            else{
                node temp=head;
                node p=null;
                while(temp.next!=null){ //to travel before poistion
                    p=temp;  //it will travel to last poistion
                    temp=temp.next;
                }
                p.next=null; //to break The last poistion
                return null;
            }
        }
        public node delAtmid(int pos){
            if(pos==1){
                node t=head;
                head=head.next;  // this is the procedure removing first node
                t.next=null;
                return null;
            }
            else{
                node temp=head;  
                int count=1;
                while(count<pos-1){ //traveling till the before the poistion
                    count++;
                    temp=temp.next;
                }
                node p=temp.next; //p will store the temp value without losssing
                temp.next=p.next; //p to next address will be stored int the tempt to next node for linking the next node
                p.next=null; // remove the link between p to linked list
                return null;
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
            //Inserting in the Begining
            sl.insertAtbeg(50);
            sl.insertAtbeg(60);
            //Inserting in the Last
            sl.insertAtLast(70);
            sl.insertAtLast(80);
            //Inserting at specific poistion
            sl.insertAtMiddle(90, 3);
            sl.insertAtMiddle(100, 10);
            //deleting at beg
            sl.delAtBeg();
            //delete at last
            sl.delAtLast();
            //deleting at midd
            sl.delAtmid(3);
            sl.delAtmid(7);
            //calling display Function
            sl.display();
            //finding the length of the linkedList
            sl.LengthOfList();
        }
    }
