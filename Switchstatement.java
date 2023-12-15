//1st button----> Hello
//2nd button----> namaste
//3rd button----> bonjour

import java.util.*;

public class Switchstatement{

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int button= sc.nextInt();

        switch(button){

            case 1: 
            System.out.println("Hello");
            break;

            case 2:
            System.out.println("Namaste");
            break;

            case 3:
            System.out.println("Bonjour");

            default:
            System.out.println("Invalid entry");
        }
    }
    
}
