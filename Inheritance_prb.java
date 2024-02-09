class Triangle {
    private double width;
    private double height;
    private String style;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setStyle(String s) {
        this.style = s;
    }

    public String getStyle() {
        return style;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Constructor for Triangle class
    public Triangle(String s, double w, double h) {
        setWidth(w);
        setHeight(h);
        setStyle(s);
    }

    // Getter for area in Triangle class
    public double area() {
        return getWidth() * getHeight() / 2;
    }

    // Method to show the style in Triangle class
    public void showStyle() {
        System.out.println("Triangle is " + style);
    }

    // Nested class shapes
    static class shapes extends Triangle {
        shapes(String s, double w, double h) {
            super(s, w, h);
        }

        // Overriding area method in shapes class
        double area1() {
            return getWidth() * getHeight() / 2;
        }
    }
}

public class Inheritance_prb {
    public static void main(String[] args) {
        Triangle.shapes t1 = new Triangle.shapes("filled", 4.0, 4.0);
        Triangle.shapes t2 = new Triangle.shapes("outlined", 6.0, 8.0);

        // Displaying areas for both objects
        System.out.println("Area of t1: " + t1.area());
        System.out.println("Area of t2: " + t2.area());
    }
}
