import java.util.*;

public class Diagonal_Element {

    static void principalDiagonal(int arr[][] , int n){
        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    sum = sum + arr[i][j];
                    System.out.print(arr[i][j] + ", ");
                }
            }
        }
        System.out.println("Sum is:");
        System.out.print(sum);
        System.out.println();
    }

    static void secondaryDiagonal(int arr[][] , int n){
        int sum1 = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if((i + j) == (n - 1)){
                    sum1 = sum1 + arr[i][j];
                    System.out.print(arr[i][j] + ", ");

                }
            }
        }
        System.out.println("Sum is");
        System.out.print(sum1);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int arr[][] = {{1 , 2 , 3 , 4} , {2 , 3 , 4 , 5} , {3 , 4 , 5 , 6}, {4 , 5 , 6 , 7}};

        principalDiagonal(arr, 4);
        secondaryDiagonal(arr , 4);
    }
}
