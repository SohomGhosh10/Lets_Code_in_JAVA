public class Multiple_Inheritance {
    public static void main(String[] args){
        child ch = new child();
        ch.eat();
        ch.run();
    }
}

interface Father{
    public void eat();
}

interface Mother{
    public void run();
}

class child implements Mother , Father{
    public void eat(){
        System.out.println("Eat");
    }

    public void run(){
        System.out.println("Run");
    }
}
