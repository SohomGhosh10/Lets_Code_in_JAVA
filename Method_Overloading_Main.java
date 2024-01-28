public class Method_Overloading_Main {
    static void foo(){
        System.out.println("Good morning bro!");
    }

    static void foo(int a){
        System.out.println("Good morning" + a + " bro!");
    }

    static void foo(int a , int b){
        System.out.println("Good morning" + a + " bro!");
        System.out.println("Good morning" + b + " bro!");
    }
    public static void main(String[] args) {
        //Method overloading means method name can be same but must have different numbers of parameters
        //Method overloading does not depends on return type of the function

        foo();
        foo(1000); // a is an argument
        foo(1000 , 3000); // a and b are parameters
    }
}
