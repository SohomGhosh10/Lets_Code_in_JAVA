import java.util.*;
public class LinkedlistExample {
    public static void main(String[] args) {
        LinkedList<Integer> L1 = new LinkedList<Integer>();
        L1.add(10);
        L1.add(20);
        L1.add(30);
        L1.add(40);
        L1.add(50);
        L1.add(60);
        System.out.println("The original linkedlist is " + L1);
        L1.remove(0);

        System.out.println("Remove 10:" + L1);
        L1.addFirst(10);
        System.out.println("Add in the first position:" + L1);
        L1.addLast(60);
        System.out.println("Last insertion:" + L1);

        L1.removeFirst();
        System.out.println("Remove first element:" + L1);

        L1.removeLast();
        System.out.println("Remove last element:" + L1);

        System.out.println("Pick first element:" + L1.getFirst());
        System.out.println("Pick last element:" + L1.getLast());

        System.out.println("The original linkedlist:" + L1);

        System.out.println("The first element is:" + L1.peek());
        System.out.println("The first element is:" + L1.peekFirst());
        System.out.println("The last element is:" + L1.peekLast());

        System.out.println(L1.get(0));
        System.out.println("The current linkedlist is:" + L1);
        L1.set(0 , 5);
        L1.add(100);
        L1.add(200);
        System.out.println(L1);
        L1.set(1 , 25);
        System.out.println(L1);

        LinkedList<Integer> L2 = new LinkedList<Integer>();
        /*
         * System.out.println(L2.getFirst());
         * if there is no value,
         * then for removeFirst()
         * it will give java.util.NoSuchElementException will occur
         * 
         * in case of poll(),
         * null will be output
         */
    }
}
