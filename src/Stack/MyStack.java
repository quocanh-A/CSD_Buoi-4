package Stack;

public class MyStack {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;
    private int length;

    public MyStack() {
        top = null;
        length = 0;
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        length++;
    }

    // pop(): remove top element and return data of removed element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack length: " + stack.getLength());

        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack length after pop: " + stack.getLength());
    }
}
