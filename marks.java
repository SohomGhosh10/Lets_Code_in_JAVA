import java.util.*;

public class marks {
     public static void main(String[] args){
         Scanner sc= new Scanner(System.in);

         int input;

         do{
             int marks= sc.nextInt();

             if(marks>=90 && marks<=100){
                System.out.println("This is Excellent");
             }
             else if(marks>=65 && marks<=90){
                System.out.println("This is Good");
             }
             else if(marks>=0 && marks<=65){
                System.out.println("This is pass marks");
             }
             else{
                System.out.println("Invalid Entry");
             }

             System.out.println("Want to continue(1) or discontinue(0)");
             input= sc.nextInt();
         }
         while(input==1);
     }
}
