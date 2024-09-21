import java.util.*;
public class Armstrong_Number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(isArm(num)){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }

    public static boolean isArm(int num){
        int temp = num;
        int sum = 0;
        int digit = count(num);
        while(num > 0){
            int digits = num % 10;
            sum += Math.pow(digits , digit);
            num /= 10;
            if(sum == temp){
                return true;
            }
        }
        return false;
    }

    public static int count(int num){
        int count = 0;
        while(num != 0){
            count++;
            num /= 10;
        }
        return count;
    }
}