class Box{
    double width;
    double height;
    double depth;

    public Box(double w , double h , double d){
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    double volume(){
        return width * height * depth;
    }
}

public class Constructor_Example2 {
    public static void main(String[] args) {
        Box b1 = new Box(10 , 20 , 15);
        Box b2 = new Box(3 , 6 , 9);

        double vol1 = b1.volume();
        System.out.println(vol1);

        double vol2 = b2.volume();
        System.out.println(vol2);

    }
}
