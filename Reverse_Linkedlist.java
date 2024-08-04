public class Reverse_Linkedlist {
    class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }
    
    public void reverse(Node head){
        if(head == null){
            return;
        }

        reverse(head.next);
        System.out.println(head.data);
    }

    public void printDetails(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }
    public static void main(String[] args){
        Reverse_Linkedlist rl = new Reverse_Linkedlist();
        rl.addFirst("null");
        rl.addFirst("1");
        rl.addFirst("2");
        rl.printDetails();
        rl.reverse(rl.head);
        
    }
}
