public class StringConcat {
    public static void main(String[] args) {
        String str1 = "Class";
        String str2 = "room";
        String str3 = str1 + str2;

        /*
            Operator overloading concept

            '+' operator performs addition and here it is used for string concatenation
            So it is told as operator overloading
         */

        System.out.println(str3);
        int x = 20 , y = 22;
        System.out.println("String is : " + str3 + x + y);
        System.out.println("String is : " + x + str3 + x + y);
        System.out.println("String is : " + x + y + str3);
        System.out.println("String is : " + str3 + (x + y));
        System.out.println("String is : " + (x + y) + str3);
        System.out.println(x + y + str3);
        String one = "Hello";
        String two = one.concat("Hi");
        System.out.println(two);
    }
}
