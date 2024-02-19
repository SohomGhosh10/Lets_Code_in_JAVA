import java.util.*;

public class Fibonacci_Recursion {

    public static class Fibonacci{
        static int CalFibo(int num){
            if(num <= 1){
                return 1;
            }
            else{
                return CalFibo(num - 1) + CalFibo(num - 2); // recursive approach
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Fibonacci fibo = new Fibonacci();
        //int result = fibo.CalFibo(num);

        for(int i = 0; i < num; i++) {
            System.out.println(fibo.CalFibo(i) + " ");
        }
    }
}
