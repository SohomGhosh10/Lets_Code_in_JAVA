import java.util.*;

public class Arrays{
    public static void main(String[] args){

        // Declaring array of integer type
        int[] marks = new int[3];
        /*other procedure
            for declaring array
            suppose for size 3

            int[] marks = {97 , 90 , 95};
        */
        marks[0] = 97;
        marks[1] = 90;
        marks[2] = 95;

        System.out.println("Marks are");
        
        // Displaying marks
       for(int i = 0; i < 3; i++){
            System.out.println(marks[i]);
        }
    }
}
