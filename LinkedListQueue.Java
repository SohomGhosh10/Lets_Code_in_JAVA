public class LinkedListQueue {

    // Static nested Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue {
        private Node head = null;
        private Node tail = null;

        // Check if the queue is empty
        boolean isEmpty() {
            return head == null;
        }

        // Add an element to the queue
        void add(int data) {
            Node newNode = new Node(data);
            if (tail == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // Remove an element from the queue
        int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;  // Indicates that the queue is empty
            }

            int front = head.data;
            head = head.next;
            if (head == null) {
                tail = null;  // If the queue becomes empty, set tail to null as well
            }
            return front;
        }

        // Peek at the front element of the queue
        int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;  // Indicates that the queue is empty
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        while (!q.isEmpty()) {
            System.out.println("Front element: " + q.peek());
            q.remove();
        }
    }
}
