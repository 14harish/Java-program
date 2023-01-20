
public class circularLinkedList {
   static node head;
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    void addfirst(int data){
        node n=new node(data);
        node temp=head;
        if(head==null){
            head=n;
            n.next=head;
        }else{
        n.next=temp;
        do{
            temp=temp.next;
        }while(temp.next!=head);
        temp.next=n;
        head=n;
    }
        // return head;
    }
    void addLast(int data){
        node d=new node(data);
        node temp=head;
        // int count=0;
        if(head==null){
            head=d;
            d.next=head;
        }else{
        // while(count!=1){
        //     if(temp.next.next==head){
        //         count++;
        //     }
        //     // System.out.println(temp.data+"--");
        //     temp=temp.next;
        // }
        // // System.out.println(temp.data+"-+");
        do{
            temp=temp.next;
        }while(temp.next!=head);
        temp.next=d;
        d.next=head;
    }
    }
    void deleteFirst(){
        if(head==null){
            return;
        }
        node p=head;
        head=p.next;
        node temp=head;
        do{
            temp=temp.next;
        }while(temp.next!=p);
        temp.next=head;
    }
    void deleteLast(){
        if(head==null){
            return;
        }
        node temp=head;
        do{
            temp=temp.next;
        }while(temp.next.next!=head);
        temp.next=head;
    }
    void display(){
        node temp=head;
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        do{
            System.out.print(temp.data+"--");
            temp=temp.next;
        }while(temp!=head);
        System.out.println();
    }
    void reverse(){
        node n=head;
        node temp=head;
        node last=head;
        node p=null;
        do{
            n=n.next;
            last=last.next.next;
        }while(n.next!=head);
        // System.out.println(last.data);
        do{
            p=temp.next;
            temp.next=n;
            n=temp;
            temp=p;
        }while(temp.next!=head);
        // System.out.println(temp.data);
        temp.next=last;
        head=temp;
    }
    public static void main(String[] args) {
        circularLinkedList c=new circularLinkedList();
        c.addfirst(10);
        c.addfirst(20);
        c.addfirst(30);
        c.addLast(40);
        c.addLast(50);
        c.addLast(60);

        c.display();
        // c.deleteFirst();
        // c.display();
        // c.deleteLast();
        // c.display();
        c.reverse();
        c.display();

    }
}
