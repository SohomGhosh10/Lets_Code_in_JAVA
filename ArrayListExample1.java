import java.util.*;
public class ArrayListExample1{
    public static void main(String[] args) {
        ArrayList<String> days = new ArrayList<String>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");

        // To see the whole content of the arraylist
        System.out.println(days);
        // Using loop
        for(String s:days){
            System.out.println(s);
        }
        System.out.println(days.size()); // days.length
        System.out.println(days.get(0)); // days[0]
        days.remove("Monday");
        System.out.println(days);

        days.remove(3); // remove element using index
        System.out.println(days);

        // Add element
        days.add(1,"Monday");
        days.add(4 , "Thursday");
        System.out.println(days);

        System.out.println("Total elements: " + days.size());

        /*
         * for(int i = 0; i < arr.length; i++){
         *      System.out.println(arr[i]);
         * }
         */

         for(int i = 0; i < days.size(); i++){
            System.out.println(days.get(i));
         }
    }
}