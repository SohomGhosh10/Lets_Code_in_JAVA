import java.util.*;

public class Exception1 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int sum = 0;
        double percentage;
        int size = sc.nextInt();

        int[] marks = new int[size];
        try{
        for(int i = 0; i < marks.length ; i++){
            marks[i] = sc.nextInt();

            if(marks[i] < 0 || marks[i] > 50){
                System.out.println("RangeException occured");
            }
            sum += marks[i];
        }
        percentage = (sum / size * 50) * 100;
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + sum);
        System.out.printf("Percentage: %.2f%%\n", percentage);
    }catch(Exception e){
        System.out.println(e);
    }
    }
}

