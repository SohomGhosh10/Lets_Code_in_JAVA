import java.util.*;

public class Problem_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];

        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

         int x = sc.nextInt();

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == x){
                System.out.println("x is found at index:" + i);
            }
        }
    }
}
