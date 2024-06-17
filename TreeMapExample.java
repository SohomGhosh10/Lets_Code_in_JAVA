import java.util.*;
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer , String> tr = new TreeMap<Integer , String>();
        tr.put(100 , "Java");
        tr.put(200 , "JS");
        tr.put(300 , "Python");
        tr.put(400 , "C++");
        tr.put(500 , "C");
        System.out.println(tr.entrySet());
        for(Map.Entry x : tr.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
