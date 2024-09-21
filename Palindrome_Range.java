import java.util.*;
public class Palindrome_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();

        for(int i = min; i <= max; i++){
            if(isPalindrome(i)){
                System.out.println(i + " ");
            }
        }
    }

    public static boolean isPalindrome(int n){
        int temp = n;
        int rem;
        int rev = 0;

        while(n > 0){
            rem = n % 10;
            rev = (rev*10) + rem;
            n = n / 10;
        }

        if(rev == temp){
            return true;
        }else{
            return false;
        }
    }
}
