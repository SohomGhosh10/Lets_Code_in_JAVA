import java.util.*;
public class Octal_To_Hexa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String octal = sc.nextLine();

        int decimal = Integer.parseInt(octal , 10);
        String hexa = Integer.toHexString(decimal).toUpperCase();

        System.out.println(hexa);
    }
}
