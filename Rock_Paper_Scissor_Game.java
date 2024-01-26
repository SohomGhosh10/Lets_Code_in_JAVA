import java.util.*;
import java.util.Random.*;

public class Rock_Paper_Scissor_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 = rock");
        System.out.println("2 = paper");
        System.out.println("3 = scissor");
        System.out.println("Choose your option");

        int a = sc.nextInt();
        if(a == 1){
            System.out.println("It is Rock");
        }
        else if(a == 2){
            System.out.println("It is Paper");
        }
        else{
            System.out.println("It is Scissor");
        }

        Random rand = new Random();
        int b = rand.nextInt(1,4);
        if(b == 1){
            System.out.println("It is Rock");
        }
        else if(b == 2){
            System.out.println("It is Paper");
        }
        else{
            System.out.println("It is Scissor");
        }

        switch(b){
            case 1:
                System.out.println("B choose Rock");
                break;
            case 2:
                System.out.println("B choose Paper");
                break;
            case 3:
                System.out.println("B choose Scissor");
                break;
        }
        if(a==1 & b==1){
            System.out.print("The game is draw");
        }
        else if(a==1 & b==2){
            System.out.print("PC is the winner");
        }
        else if(a==1 & b==3){
            System.out.print("You are the winner");
        }
        else if(a==2 & b==1){
            System.out.print("PC the winner");
        }
        else if(a==2 & b==2){
            System.out.print("The game is draw");
        }
        else if(a==2 & b==3){
            System.out.print("PC is the winner");
        }
        else if(a==3 & b==1){
            System.out.print("PC is the winner");
        }
        else if(a==3 & b==2){
            System.out.print("You are the winner");
        }
        else if(a==3 & b==3){
            System.out.print("The game is draw");
        }

    }

}
