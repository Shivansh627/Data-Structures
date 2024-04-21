
import java.util.Scanner;
public class traversal {

    public static class node{
        int data;
        node left;
        node right;

        public node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static class treecre{
        static node create(){
            node root =null;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the value:");
            int data= sc.nextInt();
            if (data==-1){
                return null;
            }
            
        
            root=new node(data);
            System.out.println("Enter the left child of "+root.data);
            root.left= create();
            System.out.println("Enter the right child of "+root.data);
            root.right= create();
            

            return root;
            
        }

        static void inorder(node root){
            if (root==null)
            return;
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
        static void preorder(node root){
            if (root==null)
            return;
            System.out.print(root.data + " ");
            inorder(root.left);
            inorder(root.right);
        }
        static void postorder(node root){
            if (root==null)
            return;
            inorder(root.left);
            inorder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public static void main(String[] args) {
        node root=treecre.create();

        treecre.inorder(root);
        System.out.println();
        treecre.preorder(root);
        System.out.println();
        treecre.postorder(root);
        
    }
    
}
