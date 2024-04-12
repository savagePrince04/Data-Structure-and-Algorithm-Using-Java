package Lec31;
import java.util.*;
public class Binary_Tree {
    class Node {
        int val;
        Node left;
        Node right;
    }

    private Node root;
    Scanner sc = new Scanner(System.in);

    public Binary_Tree() {
        root = CreateTree();
    }

    private Node CreateTree() {
        int item = sc.nextInt();
        Node node = new Node();
        node.val = item;
        boolean hlc = sc.nextBoolean();
        if (hlc) {
            node.left = CreateTree();
        }
        boolean hrc = sc.nextBoolean();
        if (hrc) {
            node.right = CreateTree();
        }
        return node;

    }

    public void PreOrder() {
        PreOrder(this.root);
        System.out.println();
    }

    private void PreOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        PreOrder(node.left);
        PreOrder(node.right);
    }

    public void InOrder() {
        InOrder(this.root);
        System.out.println();
    }

    private void InOrder(Node node) {
        if (node == null) {
            return;
        }
        InOrder(node.left);
        System.out.print(node.val + " ");
        InOrder(node.right);
    }

    public void PostOrder() {
        PostOrder(this.root);
        System.out.println();
    }

    private void PostOrder(Node node) {
        if (node == null) {
            return;
        }
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.val + " ");
    }
}
