import java.util.*;

public class BinaryTree {
    node root;
    class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
        }
    } 
    void insert(int d){
        node n=new node(d);
        if(root==null){
            root=n;
            return;
        }
        node temp=root;
        node p=null;
        while(temp!=null){
            p=temp;
            if(d<temp.data){
                temp=temp.left;
            }else{
                temp=temp.right;
            }
        }
        if(d<p.data){
            p.left=n;
        }else{
            p.right=n;
        }
    }

    void display(){
        if(root==null){
            System.out.println("Empty!!!!!!!!!!!!!!!!!!!!!!!!!");
            return ;
        }
        Queue<node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            node temp=q.poll();
            if(temp.left!=null){
                q.add(temp.left);
                System.out.println(temp.data+"---Left");
            }
            if(temp.right!=null){
                q.add(temp.right);
                System.out.println(temp.data+"---Right");
            }
            
        }
    }

    public static void main(String[] args) {
        BinaryTree b=new BinaryTree();
        b.insert(10);
        b.insert(50);
        b.insert(40);
        b.insert(30);
        b.insert(25);
        b.display();
    }
}
