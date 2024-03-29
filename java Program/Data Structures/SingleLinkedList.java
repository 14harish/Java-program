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
            if(head==null){
                head=beg;
                return;
            }
            beg.next=head; 
            head=beg;
        }
        public void insertAtLast(int value){
            node last=new node(value);
            if(head==null){
                head=last;
                return;
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
            if(head==null){
                head=mid;
                return;
            }
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
        public boolean search(int key){
            node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                if(key==temp.data){
                    System.out.println(count);
                    return true;
                }
                temp=temp.next;
            }
            return false;
        }
        public node reverse(){
             node temp=head;
             node p=null;
             node n=null;
             while(temp!=null){
                 n=temp.next;
                 temp.next=p;
                 p=temp;
                 temp=n;
            }
            head=p;
            return head;
            }
        public node middle(){
            if(head==null){
                return head;
            }
            node temp=head;
            node p=head;
            while(temp!=null && temp.next!=null){
                p=p.next;
                temp=temp.next.next;
            }
            return p;
        }
        public void removeDup(){ //check
            if(head==null){
                return;                       
             }
            node temp=head;
            while(temp!=null && temp.next!=null){
                if(temp.data==temp.next.data){
                    temp.next=temp.next.next;
                }
                else{
                    temp=temp.next;
                }
            }
        }
        public void removeUsingKey(int key){
            node temp=head;
            node p=null;
            if(temp!=null && temp.data!=key){
                head=temp.next;
            }
            while(temp!=null && temp.data!=key){
                p=temp;
                temp=temp.next;
            }
            if(temp==null)return;
            p.next=temp.next;
        }
        public static void main(String[] args) {
            SingleLinkedList sl=new SingleLinkedList();
            sl.insertAtbeg(10);
            sl.insertAtbeg(20);
            sl.insertAtLast(30);
            sl.insertAtLast(40);
            sl.insertAtMiddle(70,3);
            sl.delAtBeg();
            sl.delAtLast();
            sl.delAtmid(2);
           System.out.println( sl.search(30));
          
            // sl.head=new node(10);
            // node second=new node(20);
            // node third=new node(30);
            // node fourth=new node(40);   
    
            //Linking the four node using single linked list
            // sl.head.next=second;
            // second.next=third;
            // third.next=fourth;
            //Inserting in the Begining
                sl.insertAtbeg(50);
                sl.insertAtbeg(60);
            //Inserting in the Last
                // sl.insertAtLast(70);
                // sl.insertAtLast(80);
                // sl.insertAtLast(50);
            //Inserting at specific poistion
                // sl.insertAtMiddle(90, 3);
                // sl.insertAtMiddle(50, 10);
            //deleting at beg
                // sl.delAtBeg();
            //delete at last
            // sl.delAtLast();
        //     //deleting at midd
        //     sl.delAtmid(3);
        //     sl.delAtmid(7);
        //     //searching the element
        //    System.out.println( sl.search(50));
        //    //Delete the given value in the linkedList
        //    sl.removeUsingKey(30);
        //    //Reverse the linked list
        //   sl.reverse();
        //   //Displaying Middle Element
        //   System.out.println(sl.middle().data);
        //   //removing Duplicates
        //   sl.removeDup();
        //     //calling display Function
        //     sl.display();
        //     //finding the length of the linkedList
        //     sl.LengthOfList();
        sl.reverse();
        sl.display();
        sl.reverse();
        sl.display();
        }
    }
