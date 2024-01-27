import java.util.*;

public class Array_2D_Sum {
    public static void main(String[] args) {

        int mat1[][] = {{10 , 3 , 7} , {2 , 8 , 15}};
        int mat2[][] = {{18 , 31 , 17} , {20 , 0 , 5}};
        int result[][] = {{0 , 0 , 0} , {0 , 0 , 0}};

        for(int i = 0; i < mat1.length; i++){
            for(int j = 0; j < mat1[i].length; j++) {
                System.out.format("i is at %d and j is at %d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        for(int i = 0; i < mat1.length; i++){
            for(int j = 0; j < mat1[i].length; j++) {
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println("");
        }
    }
}
