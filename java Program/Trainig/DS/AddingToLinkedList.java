import java.math.BigInteger;
import java.util.Scanner;

// import BinaryTree.node;

public class AddingToLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node add(Node head,int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
        }else{
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
       }
        return head;
    }
    public static StringBuffer convertString(Node head){
        StringBuffer sc=new StringBuffer();
        Node temp=head;
        while(temp!=null){
            sc.append(temp.data);
            temp=temp.next;
        }
        return sc;
    }
    static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node AddingWithCarry(Node head,Node root){
        Node res=null;
        Node temp1=head,temp2=root;
        int carry=0;
        while(temp1!=null && temp2!=null){
            int val=temp1.data+temp2.data+carry;
            temp1=temp1.next;
            temp2=temp2.next;
            carry=val/10;
            res=add(res, val%10);
        }
        Node temp3=(temp1==null)?temp2:temp1;
        while(temp3!=null){
            int val=temp3.data+carry;
            temp3=temp3.next;
            carry=val/10;
            res=add(res, val%10);
        }
        if(carry!=0){
            res=add(res,carry);
        }
        return res;
    }
    public static void main(String[] args) {
        Node head=null;
        // Scanner sc=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StringBuffer s1=new StringBuffer();
        StringBuffer s2=new StringBuffer();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            head=add(head, val);
        }
        Node root=null;
        int s=sc.nextInt();
        for(int i=0;i<s;i++){
            int val=sc.nextInt();
            root=add(root,val);
        }
        s1=convertString(head);
        s2=convertString(root);
        // System.out.println(s1+"---"+s2);

        s1.reverse();
        s2.reverse();


        BigInteger c=new BigInteger(s1.toString()),d=new BigInteger(s2.toString());
        c=c.add(d);
        StringBuffer dup=new StringBuffer(c+"");
        dup.reverse();
        

        Node res=null;
        for(int i=0;i<dup.length();i++){
            int val=Integer.parseInt(dup.charAt(i)+"");
            res=add(res,val);
        }

        Node res2=AddingWithCarry(head, root);
        display(head);
        display(root);
        display(res);
        display(res2);
    }    
}
