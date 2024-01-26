import java.util.*;

public class String_problem {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String website = sc.next();

        if(website.endsWith(".org")){
            System.out.println("It is an organizational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("It is an commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("It is an indian website");
        }
    }
}
