package Lec33;

public class BST {
    class node{
        int data;
        node left;
        node right;
    }
    node root;
    BST(int arr[]){
        root = CreateBinaryTree(arr,0,arr.length-1);
    }
    public node CreateBinaryTree(int arr[],int low,int high){
        if(low>high){
            return null;
        }
        node newnode=new node();
        int mid=(low+high)/2;
        newnode.data=arr[mid];
        newnode.left = CreateBinaryTree(arr,low,mid-1);
        newnode.right = CreateBinaryTree(arr,mid+1,high);
        return newnode;
    }
    public void Disp(){
        Display(root);
    }
    public void Display(node root){
        if(root==null){
            return;
        }
        String s="------>"+root.data+"-------->";
        if(root.left!=null){
            s=root.left.data+s;
        }
        else{
            s=s+"null";
        }
        if(root.right!=null){
            s=s+root.right.data;
        }
        else{
            s=null+s;
        }
        System.out.println(s);
        Display(root.left);
        Display(root.right);
    }
    public void Pre(){
        PreOrder(root);
    }
    public void PreOrder(node root){
        if(root==null){
            return;
        }
        PreOrder(root.left);
        System.out.print(root.data+" ");
        PreOrder(root.right);
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80};
        BST sc= new BST(arr);
        sc.Disp();
        sc.Pre();
    }
}
