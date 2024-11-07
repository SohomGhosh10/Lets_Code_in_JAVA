public class LinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertMiddle(int data, int index) {
        if (head == null) {
            return;
        }
        Node newNode = new Node(data);
        Node curr = head;
        for (int i = 0; i < index - 1; i++) {
            if (curr == null || curr.next == null) {
                return;
            }
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
    }

    public void deleteIndex(int index) {
        if (head == null) {
            return;
        }
        if (index == 0) {
            deleteFirst();
            return;
        }
        Node curr = head;
        for (int i = 0; i < index - 1; i++) {
            if (curr == null || curr.next == null) {
                return;
            }
            curr = curr.next;
        }
        if (curr.next != null) {
            curr.next = curr.next.next;
        }
    }

    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList pr = new LinkedList();
    
        pr.insertLast(10);
        pr.insertLast(15);
        pr.insertFirst(1);
        pr.insertMiddle(5, 2);
        System.out.print("List after inserts: ");
        pr.print();  // Expected output: 1 10 5 15
    
        pr.reverse();
        System.out.print("List after reversing: ");
        pr.print();  // Expected output: 15 5 10 1
    
        pr.deleteFirst();
        System.out.print("List after deleting first: ");
        pr.print();  // Expected output: 5 10 1
    
        pr.deleteLast();
        System.out.print("List after deleting last: ");
        pr.print();  // Expected output: 5 10
    
        pr.deleteIndex(1);
        System.out.print("List after deleting at index 1: ");
        pr.print();  // Expected output: 5
    }
    
}
