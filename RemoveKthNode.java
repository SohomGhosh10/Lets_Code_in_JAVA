
public class RemoveKthNode {
    class Node{
        Node next;
        int data;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        Node currNode = head;
        if(head == null){
            head = newNode;
            return;
        }
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printDetails(){
        Node currNode = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        while(currNode != null){
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }

    public Node deleteKthNode(int n){
        if(head == null || head.next == null){
            return null;
        }

        Node currNode = head;
        int size = 1;
        while(currNode != null){
            currNode = currNode.next;
            size++;
        }

        if(n == size){
            return head.next;
        }

        int index = size - n;
        int i = 1;
        Node prev = head;
        while(i < index){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head.next;
    }

    public static void main(String[] args) {


        RemoveKthNode rk = new RemoveKthNode();
        rk.addFirst(1);
        rk.addFirst(2);
        rk.addFirst(3);
        rk.addFirst(4);
        rk.addLast(5);
        rk.deleteKthNode(3);
        rk.printDetails();
    }

}
