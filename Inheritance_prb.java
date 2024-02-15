class Triangle1{
    static double height;
    static double width;

    Triangle1(){
        System.out.println("I am a default constructor");
    }

    public double getHeight(){
        return height;
    }

    public double getwidth(){
        return width;
    }


    Triangle1(double height , double width){
        this.height = height;
        this.width = width;
    }

    static double getArea(){
        return (width * height) / 2;
    }

}

class shapes extends Triangle1{
    String style;
    static double height;
    static double width;
    shapes(double h , double w , String style){
        super(h , w);
        this.style = style;
    }

}

public class Inheritance_prob {
    public static void main(String[] args) {
        shapes sr = new shapes(3 , 4 , "Alien");
        double area = shapes.getArea();

        System.out.println("Area is " + area);
    }
}
