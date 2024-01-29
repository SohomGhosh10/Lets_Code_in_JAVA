import java.io.*;
import java.util.*;

public class Factorial_Recursion {
    public static class Factorial{
        long CalFact(int num){
            if(num < 0){
                System.out.println("Not valid");
            }
            if(num == 1 || num == 0){
                return 1;
            }
            else{
                return num * CalFact(num - 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Factorial fact = new Factorial();
        long result = fact.CalFact(num);

        System.out.println(result);
    }
}
