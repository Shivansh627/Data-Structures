package queue;

public class first {
    int Q[] = new int[100];
    int front = 0, rear = -1;

    public void qq(int data) {
        if (rear != 99) {
            Q[++rear] = data;
        } else {
            System.out.println("Queue is full");
        }
    }

    public void deq() {
        if (rear < front) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("the popped element is :" + Q[front++]);
        }
    }

    public void peek() {
        System.out.println("peek -->" + Q[front]);
    }

    public void dis() {
        if (rear < front) {
            System.out.println("empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.println(Q[i]);
            }
        }
    }

    public static void main(String[] args) {
        first f = new first();
        f.qq(10);
        f.qq(20);
        f.qq(30);
        f.peek();
        f.qq(40);

        f.dis();
        f.deq();
        f.dis();
    }
}
