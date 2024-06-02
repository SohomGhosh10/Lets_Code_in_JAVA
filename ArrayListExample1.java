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

         days.set(0 , "Funday");

         System.out.println();
         for(int i = 0; i < days.size(); i++){
            System.out.println(days.get(i));
         }

         Collections.sort(days); // ASCII wise sorting

         System.out.println();
         for(int i = 0; i < days.size(); i++){
            System.out.println(days.get(i));
         }

         ArrayList<Integer> num1 = new ArrayList<Integer>();
         ArrayList<Double> num2 = new ArrayList<Double>();

         num1.add(10);
         num1.add(20);
         num1.add(30);
         num1.add(40);

         for(int i = 0; i < num1.size(); i++){
            System.out.println(num1.get(i));
         }

         num2.add(10.8);
         num2.add(20.8);
         num2.add(30.8);
         num2.add(40.8);

         for(int i = 0; i < num2.size(); i++){
            System.out.println(num2.get(i));
         }

         ArrayList<Float> numF = new ArrayList<Float>();
         numF.add(19.7f);
         numF.add(19.8f);

         ArrayList<Character> numC = new ArrayList<Character>();
         /*
          * Wrapper class:
            ArrayList<String/Wrapper Class> numC = new ArrayList<String/Wrapper Class>();
          */

          //ArrayList to Array Conversion
          Integer a[] = new Integer[num1.size()];
          a = num1.toArray(a);
          System.out.println();
          for(int i : a){
            System.out.println(i + " ");
          }

          for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
          }

          System.out.println(days);
          days.removeAll(days);
          System.out.println(days);

          days.add("Sunday");
          days.add("Monday");
          days.add("Tuesday");
          days.add("Wednesday");
          days.add("Thursday");
          days.add("Friday");
          days.add("Saturday");

          System.out.println(days.contains("Friday"));
          System.out.println(days.contains("Classroom"));

          int index = days.indexOf("Friday");
          System.out.println(index);

          int lastIndex = days.indexOf("Friday");
          System.out.println(lastIndex);

          System.out.println(days.isEmpty());
          String output = days.toString();
          System.out.println(output);
    }
}
