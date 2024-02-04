class Example{
    String name;
    String dept;
    int roll;

    public Example(String n){
        this.name = n;
    }
    public Example(String n , String d){
        this.name = n;
        this.dept = d;
    }
    public Example(String n , String d , int r){
        this.name = n;
        this.dept = d;
        this.roll = r;
    }

    public String getName(){
        return name;
    }

    public String getDept(){
        return dept;
    }

    public int getRoll(){
        return roll;
    }
}

public class Constructor_Example{
    public static void main(String[] args) {
        Example em = new Example("Sohom" , "CSE" , 64);
        System.out.println(em.getName());
        System.out.println(em.getDept());
        System.out.println(em.getRoll());
    }
}