
public class FindKthNode {
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

    int getKthFromLast(int k) {
        if(head == null){
            return -1;
        }
        
        int size = 1;
        Node curr = head;
        while(curr.next != null){
            size++;
            curr = curr.next;
        }
        
        Node prev = head;
        if(k > size){
            return -1;
        }else{
            int i = 0;
            int index = size - k;
            while(i < index){
                prev = prev.next;
                i++;
            }
        }
        return prev.data;
        
    }

    public static void main(String[] args) {


        FindKthNode rk = new FindKthNode();
        rk.addFirst(1);
        rk.addFirst(2);
        rk.addFirst(3);
        rk.addFirst(4);
        rk.addLast(5);
        int k = 3;
        int kthFromLast = rk.getKthFromLast(k);
        System.out.println("The " + k + "th element from the end is: " + kthFromLast);

        rk.printDetails();
    }

}
