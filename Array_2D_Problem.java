import java.util.*;

public class Array_2D_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int sum = 0;

        int numbers[][] = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                sum = sum + numbers[i][j];
                if(numbers[i][j] == x){
                    System.out.println("X is found at index (" + i + "," + j + ")");
                }
            }
        }
        System.out.println(sum);
    }
}
