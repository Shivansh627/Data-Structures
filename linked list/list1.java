import java.util.Scanner;
public class list1{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    public  void create(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }
    public  void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        list1 list= new list1();

        int data;
        System.out.print("Enter data:");
        data=sc.nextInt();
        list.create(10);
        list.create(20);
        list.create(40);
        list.create(50);
        list.create(data);

        list.display();
        
    }
}