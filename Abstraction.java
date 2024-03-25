class Abstraction{
    public static void main(String[] args){
        child cr = new child(5.29 , "KKR");
        double result = cr.area();
        System.out.println(result);
        System.out.println(cr.tostring());
    }
}

abstract class Parent{
    String Name;
    abstract double area();
    abstract String tostring();

    Parent(){
        System.out.println("Default Constructor");
    }

    Parent(String Name){
        this.Name = Name;
    }

    public String getName(){
        return Name;
    }

}

class child extends Parent{
    double radius;

    child(double radius , String Name){
        super(Name);
        this.radius = radius;
    }

    public double area(){
        return Math.PI * Math.pow(radius , 2);
    }

    public String tostring(){
        return getName();
    }
}
