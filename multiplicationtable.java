import java.util.*;

public class multiplicationtable {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=1; i<21; i++){
            System.out.println(n*i); // Multiplication table
        }
    }
}
