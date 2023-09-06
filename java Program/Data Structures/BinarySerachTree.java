public class BinarySerachTree {
    Node root;
    class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    }
    public BinarySerachTree(int data){
        root=new Node(data);
    }
    public Node insert(Node root,int val){
        if(root==null){
            return new Node(val);
        }
        if(val<root.data){
            root.left=insert(root.left, val);
        }else{
            root.right=insert(root.right, val);
        }
    return root;
    }
    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+"--");
            inorder(root.right);
        }
    }
    public Node search(Node root,int val){
        if(root==null || root.data==val){
            return root;
        }
        if(val<root.data){
            return search(root.left, val);
        }else{
            return search(root.right, val);
        }
    }
    public static void main(String[] args) {
        BinarySerachTree tr=new BinarySerachTree(50);
        tr.insert(tr.root, 20);
        tr.insert(tr.root, 70);
        tr.insert(tr.root, 10);
        tr.insert(tr.root, 25);
        tr.insert(tr.root, 60);
        tr.insert(tr.root, 98);
        tr.inorder(tr.root);
        System.out.println();
        if(tr.search(tr.root,10)==null){
            System.out.println("Not Found");
        }else{
            System.out.println("FOUND!!!!!!!");
        }
    }
}
