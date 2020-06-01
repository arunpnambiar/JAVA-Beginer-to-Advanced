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
        System.out.println(data);
        if (right != null) {
            right.inorder();
        }
    }
}

public class BinarySearchTree {
    public static void main(String[] args) {
        TreeMethods tree = new Tree(10);
        tree.create(5);
        tree.create(9);
        tree.create(20);
        tree.create(15);
        tree.inorder();
    }
}
