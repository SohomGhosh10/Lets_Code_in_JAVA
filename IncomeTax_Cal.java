import java.util.*;

public class IncomeTax_Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();
        float tax = 0;

        if(income <= 2.5f){
            System.out.println("No tax is to be given!");
        }
        else if(income > 2.5f && income <= 5f){
            tax = tax + 0.05f * (income - 2.5f);
        }

        else if(income > 5f && income <= 10f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 2.5f);
        }

        else if(income > 10f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (1.0f - 5.0f);
            tax = tax + 0.3f * (income - 10.0f);
        }

        System.out.println("Your tax is " + tax);
    }
}
