import java.util.*;

public class butterflypattern{

    public static void main(String[] args){

        int n = 5;
        
        // for upper part--->

        for(int i = 1; i <= n; i++){
             for(int j = 1; j <= i; j++){
                System.out.print("*");
             }

             // for spaces-->

               int spaces= 2 *  (n - i);
               for(int j = 1; j <= spaces; j++){
                System.out.print(" ");
               }
             // for 2nd part--->

                for(int j = 1; j <= i; j++){
                    System.out.print("*");
                   }
               System.out.println();
        }

        // for lower part--->
        
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
               System.out.print("*");
            }

            // for spaces-->

              int spaces = 2 * (n - i);
              for(int j = 1; j <= spaces; j++){
               System.out.print(" ");
              }
            // for 2nd part--->

               for(int j = 1; j <= i; j++){
                   System.out.print("*");
                  }
              System.out.println();
       }

    }
}
