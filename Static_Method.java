import java.util.*;

public class Static_Method {
    class Human{

        public static String typename = " ";
        static void Type(String name){
            typename = name;
        }
    }

    public static void main(String args[]){
        Human.Type("SohomGhosh");
        System.out.println(Human.typename);
    }
}
