class A{
    int x;
    public int getX(){
        return x;
    }
    public void setX(int a){
        x = a;
    }
}

class B extends A{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        A ab = new A();
        ab.setX(25);
        System.out.println(ab.getX());

        B ac = new B();
        ac.setY(55);
        System.out.println(ac.getY());
    }
}
