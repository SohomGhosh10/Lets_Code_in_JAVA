import java.util.*;
public class Sum_GP_Series {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float d = sc.nextFloat();
        int n = sc.nextInt();

        float result = sumGP(a, d, n);
        System.out.println(result);
    }

    public static float sumGP(float a , float d , int n){
        float sum = 0;
        sum += ((a * (Math.pow(d , n) - 1)) / (d - 1));
        return sum;
    }
}
