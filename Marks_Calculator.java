import java.util.*;

public class Marks_Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Physics Marks");
        int phy = sc.nextInt();

        System.out.println("Maths Marks");
        int math = sc.nextInt();

        System.out.println("Computer Marks");
        int cmp = sc.nextInt();

        System.out.println("English Marks");
        int eng = sc.nextInt();

        System.out.println("Chemistry Marks");
        int chem = sc.nextInt();

        float percentage = ((phy + math + cmp + eng + chem) / 500.0f) * 100;

        System.out.println("Percentage : ");
        System.out.println(percentage);
    }
}
