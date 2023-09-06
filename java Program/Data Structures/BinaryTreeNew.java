

public class BinaryTreeNew {
    Node root;
    class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    }
    public BinaryTreeNew(int data){
        root=new Node(data);
    }
    public void insertRight(Node r,int data){
        Node n=new Node(data); 
        r.right=n;
    }
    public void insertLeft(Node r,int data){
        Node n=new Node(data); 
        r.left=n;
    }
    public static void preorder(Node root){
        if(root!=null){
            System.out.print(root.data+"--");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+"--");
            inorder(root.right);
        }
    }
    public static void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+"--");
        }
    }
    public static void main(String[] args) {
        BinaryTreeNew tree=new BinaryTreeNew(10);
        tree.insertLeft(tree.root, 5);
        tree.insertRight(tree.root, 15);
        tree.insertLeft(tree.root.left, 3);
        tree.insertRight(tree.root.left, 8);
        tree.insertLeft(tree.root.right, 12);

        tree.preorder(tree.root);
        System.out.println();
        tree.inorder(tree.root);
        System.out.println();
        tree.postorder(tree.root);
        System.out.println();
    }
}
