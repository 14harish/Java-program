class BinaryTree {
    node root;

    class node {
        int data;
        node right;
        node left;

        node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    boolean insert(int data) {
        node n = new node(data);
        if (root == null) {
            root = n;
            return true;
        }
        node temp = root;
        while (true) {
            if (n == temp)
                return false;
            if (n.data > temp.data) {
                if (temp.right == null) {
                    temp.right = n;
                    return true;
                }
                temp = temp.right;
            } else {
                if (temp.left == null) {
                    temp.left = n;
                    return true;
                }
                temp = temp.left;
            }
        }
    }

    boolean contains(int data) {
        node n = new node(data);
        if (root == null) {
            return false;
        }
        node temp = root;
        while (temp != null) {
            if (temp.data > n.data) {
                temp = temp.left;
            } else if (temp.data < n.data) {
                temp = temp.right;
            } else if (n.data == temp.data) {
                return true;
            }
        }
        return false;
    }

    void preorder() {
        if (root == null) {
            System.out.println("NULL");
        }
        preorder(root);
        System.out.println("\n");
    }

    void preorder(node root) {
        node temp = root;
        if (temp == null) {
            return;
        }
        System.out.print(temp.data + "--->");
        preorder(temp.left);
        preorder(temp.right);
    }

    void inorder() {
        if (root == null) {
            System.out.println("NULL");
        }
        inorder(root);
        System.out.println("\n");
    }

    void inorder(node root) {
        node temp = root;
        if (temp == null) {
            return;
        }
        inorder(temp.left);
        System.out.print(temp.data + "--->");
        inorder(temp.right);
    }

    void postorder() {
        if (root == null) {
            System.out.println("NULL");
        }
        postorder(root);
        System.out.println("\n");
    }

    void postorder(node root) {
        node temp = root;
        if (temp == null) {
            return;
        }
        postorder(temp.left);
        postorder(temp.right);
        System.out.print(temp.data + "--->");
    }

    void delete(int data) {
        if (contains(data)) {
            delete(root, data);
        } else {
            System.out.println("data");
        }
    }

    public node delete(node temp, int data) {
        if (data > temp.data) {
            temp.right = delete(temp.right, data);
        } else if (data < temp.data) {
            temp.left = delete(temp.left, data);
        } else if (data == temp.data) {
            if (temp.left == null && temp.right == null) {
                temp = null;
            } else if (temp.right != null) {
                temp.data = rightTrav(temp);
                temp.right = delete(temp.right, data);
            } else if (temp.left != null) {
                temp.data = lefTrav(temp);
                temp.left = delete(temp.left, data);
            }
        }
        return temp;
    }

    int rightTrav(node rig) {
        rig = rig.right;
        while (rig.right != null) {
            rig = rig.right;
        }
        return rig.data;
    }

    int lefTrav(node lef) {
        lef = lef.right;
        while (lef.left != null) {
            lef = lef.right;
        }
        return lef.data;
    }
}

public class BST {
    public static void main(String[] args) {
        BinaryTree b = new BinaryTree();
        b.insert(10);
        b.insert(5);
        b.insert(8);
        b.insert(40);
        b.insert(30);
        b.insert(50);
        b.insert(20);

        // System.out.println(b.root.left.right.data);
        System.out.println(b.contains(111));
        b.preorder();
        b.postorder();
        b.inorder();
        System.out.println("After Deletion...");
        b.delete(50);
        b.preorder();

    }
}
