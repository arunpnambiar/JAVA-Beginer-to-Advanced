package Tree;

class Tree implements TreeMethods {
    int data;
    Tree left, right;

    public Tree(int value) {
        this.data = value;
    }

    @Override
    public void create(int value) {
        if (data >= value) {
            if (left == null) {
                left = new Tree(value);
            } else {
                left.create(value);
            }
        } else {
            if (right == null) {
                right = new Tree(value);
            } else {
                right.create(value);
            }
        }
    }

    @Override
    public void inorder() {
        if (left != null) {
            left.inorder();
        }
        System.out.print(data+"\t");
        if (right != null) {
            right.inorder();
        }
    }

    @Override
    public void postOrder() {
        System.out.print(data+"\t");
        if (left != null) {
            left.postOrder();
        }
        if (right != null) {
            right.postOrder();
        }
    }

    @Override
    public void preOrder() {
        if (left != null) {
            left.postOrder();
        }
        if (right != null) {
            right.postOrder();
        }
        System.out.print(data+"\t");
    }
}

public class BinarySearchTree {
    public static void main(String[] args) {
        TreeMethods tree = new Tree(10);
        tree.create(5);
        tree.create(9);
        tree.create(20);
        tree.create(15);
        System.out.print("Inorder: ");
        tree.inorder();
        System.out.print("Postorder: ");
        tree.postOrder();
        System.out.print("Preorder: ");
        tree.preOrder();
    }
}
