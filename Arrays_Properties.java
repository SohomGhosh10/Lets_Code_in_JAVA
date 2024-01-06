import java.util.*;

public class Arrays_Properties {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        // Declaring array
        int[] numbers = new int[size];

        // Taking input of array
        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        // Displaying array
        for(int i = 0; i < size; i++){
            System.out.println(numbers[i]);
        }
    }
}
