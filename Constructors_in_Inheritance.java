class Base{
    Base(){
        System.out.println("Base class constructor is called");
    }
}

class Derived extends Base{
    Derived(){
        System.out.println("Derived class constructor is called");
    }
}

public class Constructors_in_Inheritance {
    public static void main(String[] args) {
        Base b = new Base(); // First Base constructor will be called
        Derived d = new Derived(); // At last derived constructor is called
    }
}
