public class Doubly_LinkedList {
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public void insertFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void insertAtIndex(int data , int index){
        Node curr = head;
        Node newNode = new Node(data);
        if(index == 0){
            insertFirst(data);
        }
        for(int i = 0; i < index - 1; i++){
            if(curr == null || curr.next == null){
                return;
            }
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        newNode.prev = curr;
    }
    public void insertLast(int data){
        Node newNode = new Node(data);
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;
    }
    public void deleteFirst(){
        if(head == null){
            return;
        }
        head = head.next;
        head.prev = null;
    }
    public void deleteMiddle(int index){
        if(index == 0){
            deleteFirst();
        }
        Node curr = head;
        for(int i = 0; i < index - 1; i++){
        if(curr == null || curr.next == null){
            return;
        }
        curr = curr.next;
    }
        curr.next.prev = curr.prev;
        curr.prev.next = curr.next;
    }

    public void deleteLast(){
        Node curr = head;
        Node fast = head.next;
        while(fast.next != null){
            curr = curr.next;
            fast = fast.next;
        }
        curr.next = null;
    }

    public static void main(String[] args) {
        Doubly_LinkedList dl = new Doubly_LinkedList();
    }
}
