package Tree;

import java.util.Scanner;
public class binary {

    static class node{
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
            
            sc.close();

            return root;
            
        }
    }
    public static void main(String[] args) {
        node root=treecre.create();
        
    }
    
}
