import java.util.Scanner;
public class Palindrome_Number {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();

        int rev;
        int rem = 0;
        int temp = num;
        while(num > 0){
            rev = num % 10;
            rem = (rem*10) + rev;
            num = num / 10;
        }
        if(temp == rem){
            System.out.println("Number is pallindrome");
        }else{
            System.out.println("Number is not pallindrome");
        }
    }
}
