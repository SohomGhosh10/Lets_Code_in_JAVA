import java.util.*;
public class Sum_Of_Binary_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();

        int bin1 = Integer.parseInt(num1 , 2);
        int bin2 = Integer.parseInt(num2 , 2);

        int sum = bin1 + bin2;
        String binsum = Integer.toBinaryString(sum);

        System.out.println(binsum);
    }
}
