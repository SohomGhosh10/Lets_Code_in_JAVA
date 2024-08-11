public class Reverse_Stack {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{
        public static Node head;

        public boolean isEmpty() {
            return head == null;
        }
        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

        public void reverse() {
            if (!isEmpty()) {
                int top = pop();
                reverse();
                insertAtBottom(top);
            }
        }

        private void insertAtBottom(int data) {
            if (isEmpty()) {
                push(data);
            } else {
                int top = pop();
                insertAtBottom(data);
                push(top);
            }
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Stack sc = new Stack();
        sc.push(10);
        sc.push(20);
        sc.push(30);
        sc.push(40);
        sc.push(50);

        System.out.println("Original Stack:");
        sc.display();

        // Reverse the stack
        sc.reverse();

        System.out.println("Reversed Stack:");
        sc.display();
    }
}
