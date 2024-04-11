public class Doublee {
    class node{
        int data;
        node next,previous;
        node(int data){
            this.data=data;
            this.next=null;
            this.previous=null;
        }
    }
    static node head=null;
    public void link(int data){
        node newnode= new node(data);
        if (head==null){
            head=newnode;
        }
        else{
            head.previous=newnode;
            newnode.next=head;
            head=newnode;
        }
    }

    public void display(){
        node temp=head;
        if(head==null){
            System.out.print("empty list");
        }
        else{
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Doublee dob=new Doublee();
        dob.link(10);
        dob.link(20);
        dob.link(30);
        dob.link(40);
        dob.link(50);
        dob.display();
    }
}
