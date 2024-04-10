public class circular {

    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static node head=null;
    static node tail=null;

    public void link(int data){
        node newnode =new node(data);
        if (head==null){
            head=newnode;
            tail=newnode;
            tail.next=head;
        }
        else{
            newnode.next=head;
            head=newnode;
            tail.next=head;
        }
    }

    public void display(){
        node temp=head;
        do {
            System.out.print(temp.data + " ");
            temp=temp.next;
        } while (temp != head);
        System.out.println();
    }
    
    public static void main(String[] args) {
        circular cir =new circular();

        cir.link(20);
        cir.link(40);
        cir.link(60);
        cir.link(80);
        // System.out.println(tail.data);

        cir.display();
    }
}
