public class LinkedList1{

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

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node second_last = head;
        Node last = head.next;

        while(last.next != null){
            last = last.next;
            second_last = second_last.next;
        }

        second_last.next = null;
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
    public static void main(String[] args){
            LinkedList1 ll = new LinkedList1();
            ll.addFirst("1");
            ll.addFirst("2");
            ll.addFirst("3");
            ll.addFirst("4");
            ll.addLast("5");
            ll.printDetails();
            ll.deleteFirst();
            ll.deleteLast();
            ll.printDetails();
    }
}
