public class stack {
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    node top=null;
    public void push(int data){
        node newn=new node(data);
        if(top==null){
            top=newn;
        }
        else{
            newn.next=top;
            top=newn;
        }
    }
    public void pull(){
        if (top==null){
            System.out.println("empty stack");
        }
        else{
            System.out.println("the popped elemrnt is :" + top.data);
            top=top.next;
        }
    }

    public void peek(){
        if (top==null){
            System.out.println("empty stack");
        }
        else{
            System.out.println(top.data);
        }
    }

    public void display(){
        node temp=top;
        if (top==null){
            System.out.println("empty stack");
        }
        else{
            while(temp!=null){
                System.out.print(temp.data + "->");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        stack s=new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);

        s.peek();

        s.display();
        s.pull();
        s.display();
    }


    
}
