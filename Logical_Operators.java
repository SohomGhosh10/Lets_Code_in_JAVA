public class Logical_Operators {

    public static void main(String[] args) {
        System.out.println("For logical AND...");

        // for logical AND, associativity is from left to right
        boolean a = true;
        boolean b = false;
        if(a && b){
            System.out.println("Yes");
        }else{
            System.out.println("False");
        }

        System.out.println("For logical OR....");

        boolean c = true;
        boolean d = false;
        if(c || d){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        System.out.println("For logical NOT...");

        System.out.print("Not(a) is ");
        System.out.println(!a);

        System.out.print("Not(b) is ");
        System.out.println(!b);
    }
}
