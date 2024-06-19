import java.util.*;
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        System.out.println(ts);
        TreeSet<Integer> ti = new TreeSet<Integer>();
        ti.add(10);
        ti.add(20);
        ti.add(30);
        ti.add(40);
        ti.add(50);
        ti.add(60);
        ti.add(70);
        System.out.println(ti);
        System.out.println("First Element " + ti.first());
        System.out.println("last Element " + ti.last());
        System.out.println("Total size of ti " + ti.size());
        System.out.println("70 is present? " + ti.contains(75));
        System.out.println("Arranged in descending order: " + ti.descendingSet());
        System.out.println(ti.subSet(20,50));

        System.out.println("Remove first element " + ti.pollFirst());
        System.out.println(ti);
        System.out.println("Remove last element: " + ti.pollLast());
        System.out.println(ti);
        ti.clear();
        System.out.println("Already cleared " + ti);
    }
}
