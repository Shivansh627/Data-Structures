public class del {
    class node{
        int data;
        node next;
        node(int data){
            this.data= data;
            this.next=null;
        }
    }

    node head=null;
    public void createbeg(int data){
        node newnode= new node(data);
        if (head==null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
    }

    public void delete (int data){
        node temp,  ptr;
        temp=head;
        if (temp==null){
            System.out.println("empty");
        }
        else if(head.data==data){
            head=head.next;
        }
        while(temp.next!=null){
            if(temp.next.data==data){
                
                temp.next=temp.next.next;
                
                break;
            }
            temp = temp.next;
        }
    }

    public void display(){
        node temp =head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        del list=new del();
        list.createbeg(20);
        list.createbeg(30);
        list.createbeg(40);
        list.createbeg(50);

        list.display();
        list.delete(30);
        list.display();
        
    }
    
}
