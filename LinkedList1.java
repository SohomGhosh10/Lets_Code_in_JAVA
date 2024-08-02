public class LinkedList1 {
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

    public void printDetails(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");    
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args){
        LinkedList1 ll = new LinkedList1(); 
        ll.addFirst(" is");
        ll.addFirst(" name");
        ll.addFirst(" My");
        ll.addLast(" Sohom");
        ll.printDetails();
    }
}
