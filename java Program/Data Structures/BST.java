class BinaryTree{
    node root;
   class node{ 
    int data;
    node right;
    node left;

    node(int data){
        this.data=data;
        this.right=null;
        this.left=null;

    }
}
boolean insert(int data){
    node n=new node(data);
    if(root==null){
        root=n;
        return true;
    }
    node temp=root;
    while(true){
        if(n==temp) return false;
        if(n.data>temp.data){
            if(temp.right==null){
                temp.right=n;
                return true;
            }
           temp=temp.right;
        }else{
            if(temp.left==null){
                temp.left=n;
                return true;
            }
           temp=temp.left;
        }
    }
}
boolean contains(int data){
    node n=new node(data);
    if(root==null){
        return false;
    }
    node temp=root;
    while(temp!=null){
        if(temp.data>n.data){
            temp=temp.left;
        }
        else if(temp.data<n.data){
            temp=temp.right;
        }else{
            return true;
        }
    }
    return false;
}
}


public class BST {
    public static void main(String[] args) {
        BinaryTree b=new BinaryTree();
        b.insert(10);
        b.insert(5);
        b.insert(8);
        b.insert(40);
        b.insert(30);
        System.out.println(b.root.left.right.data);
        System.out.println(b.contains(111));

    }
}
