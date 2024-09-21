import java.util.*;
public class Sum_AP_Series {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float d = sc.nextFloat();
        float n = sc.nextFloat();
        
        float result = sumAP(a , d , n);
        System.out.println(result);
    }

    public static float sumAP(float a , float d , float n){
        float sum = 0.0f;
        sum += (n * (2.0 * a + (n - 1) * d)) / 2.0;
        return sum;
    }
}
