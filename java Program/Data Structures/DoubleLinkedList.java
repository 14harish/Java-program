public class DoubleLinkedList {
    public node head;
    private static class node{
        int data;
        node right;
        node left;
        public node (int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    public void display(){
        node temp=head;
        System.out.print("Null");
        while(temp!=null){
            System.out.print("<--"+temp.data+"-->");
            temp=temp.right;
        }
        System.out.println("Null");
    }
    public void size(){
        node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.right;
        }
        System.out.println(count);
    }
    public node DelAtbeg(){
        if(head==null){
            return null;
        }
        node temp=head;
        head=head.right;
        head.left=null;
        return null;
    }
    public void insertAtbeg(int value){
        node beg=new node(value);
        if(head==null){
            head=beg;
        }
        head.left=beg;
        beg.right=head;
        beg.left=null;
        head=beg;
    }
    public void insertAtLast(int value){
        node last=new node(value);
        if(head==null){
            head=last;
        }
        node temp=head;
        while(null!=temp.right){
            temp=temp.right;
        }
        node p=temp;
        p.right=last;
        last.left=p;
        last.right=null;
    }
    void insertAtMiddle(int value,int pos){
        node mid=new node(value);
        if(head==null){
            head=mid;
        }
        node temp=head;
        int count=1;
        while(count<pos-1){
            count++;
            temp=temp.right;
        }
        mid.right=temp.right;
        temp.right=mid;
        mid.left=temp;
    }
    public node delAtLast(){
        if(head==null){
            return null;
        }
        node temp=head;
        while(temp.right!=null){
            temp=temp.right;
        }
        temp.left.right=null;
        return null;
    }
    public node delAtmid(int pos){
        if(head==null){
            return null;
        }
        node temp=head;
        int count=1;
        while(count<pos-1){
            count++;
            temp=temp.right;
        }
        node p=temp.right.right;
        temp.right=p;
        p.left=temp;
        return null;
    }
    public boolean search(int value){
        node temp=head;
        while(temp!=null){
            if(temp.data==value){
                return true;
            }
            temp=temp.right;
        }
        return false;
    }
    public node Reverse(){
        node temp=head;
        node p=null;
        node n=null;
        while(temp!=null){
            p=temp.right;
            temp.left=p;
            temp.right=n;
            n=temp;
            temp=p;
        }
        head=n;
        return head;
    }
    public void middle(){
        node temp=head;
        node p=head;
        while(temp!=null && temp.right!=null){
            p=p.right;
            temp=temp.right.right;
        }
        System.out.println(p.data);
    }
    public static void main(String[] args) {
        DoubleLinkedList dl=new DoubleLinkedList();
        dl.head=new node(10);
        node second=new node(20);
        node third=new node(30);
        node fourth=new node(40);
        //linking double linked list
        dl.head.right=second;
        dl.head.left=null;
        second.left=dl.head;
        second.right=third;
        third.left=second;
        third.right=fourth;
        fourth.left=third;
        fourth.right=null;

        // dl.DelAtbeg();
        // dl.insertAtbeg(30);
        // dl.insertAtLast(90);
        // dl.insertAtMiddle(100, 3);
        // dl.delAtLast(); 
        // dl.delAtmid(3);
        // System.out.println(dl.search(30));
        // dl.Reverse();
        // dl.middle();
        // dl.size();
        // dl.Reverse();
        dl.display();
        dl.Reverse();
        dl.display();
    }
}
