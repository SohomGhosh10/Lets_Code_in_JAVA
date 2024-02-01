class square{
    int side;
    public int CalArea(){
        return side * side;
    }

    public int CalPeri(){
        return 4 * side;
    }
}

class rect{
    int a;
    int b;
    public int AreaCal(){
        return a * b;
    }

    public int periCal(){
        return 2 * a * b;
    }
}

public class Class_Problem2 {
    public static void main(String[] args) {

        // Object for square
        square sq = new square();
        sq.side = 10;
        System.out.println(sq.CalArea());
        System.out.println(sq.CalPeri());

        // New object for rectangle
        rect re = new rect();
        re.a = 10;
        re.b = 15;

        System.out.println(re.AreaCal());
        System.out.println(re.periCal());
    }
}
