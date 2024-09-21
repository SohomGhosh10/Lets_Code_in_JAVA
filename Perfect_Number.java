import java.util.*;
public class Perfect_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPerfect(num)){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not Perfect number");
        }
    }

    public static boolean isPerfect(int num){
        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                sum += num;
            }
        }
        if(sum == num){
            return true;
        }
        return false;
    }
}
