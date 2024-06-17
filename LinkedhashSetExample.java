import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
public class LinkedhashSetExample{
    public static void main(String[] args){
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        System.out.println(set);
        Iterator<String> str = set.iterator();
        while(str.hasNext()){
            System.out.println(str.next());
        }
        while(str.hasNext()){
            System.out.println(str.next());
        }
        while(str.hasNext()){
            System.out.println(str.next());
        }
        while(str.hasNext()){
            System.out.println(str.next());
        }
        while(str.hasNext()){
            System.out.println(str.next());
        }
        while(str.hasNext()){
            System.out.println(str.next());
        }
        while(str.hasNext()){
            System.out.println(str.next());
        }

        /*
         * In HashSet:
         * 1. Unique Elements
         * 2. Unordered
         * 
         * In LinkedHashSet:
         * 1. Unique Elements
         * 2. Ordered
         */
        Class<? extends LinkedHashSet> cls = set.getClass();
        // get all fields of the class
        Field[] fields = cls.getDeclaredFields();
        for(Field field:fields){
            System.out.println(field.getName() + " - " + field.getType());
        }
        Method[] methods = cls.getDeclaredMethods();

        for(Method method:methods){
            System.out.println(method.getName() + " - " + method.getReturnType());
        }
    }
}