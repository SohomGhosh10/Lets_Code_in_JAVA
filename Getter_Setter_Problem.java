public class Getter_Setter_Problem {

    public static void main(String[] args) {
        D ar = new D();
        ar.setRadius(9.0f);
        ar.setArea(257.5461222234f);
        ar.setCircumference(87.92322245544f);

        System.out.println("Area is " + ar.getArea() + "sq.cm");
        System.out.println("Circumference is " + ar.getCircumference() + "cm");
    }
}

class D{
    private float radius;
    private float circumference;
    private float area;

    void setRadius(float r){
        radius = r;
    }

    void setArea(float a){
        if(a == 22 * radius * radius / 7){
            area = a;
        }else{
            System.out.println("Not valid");
        }
    }

    void setCircumference(float c){
        if(c == 2 * 22 * radius * radius / 7){
            circumference = c;
        }else{
            System.out.println("Not valid");
        }
    }

    float getArea(){
        return area;
    }

    float getCircumference(){
        return circumference;
    }
}
