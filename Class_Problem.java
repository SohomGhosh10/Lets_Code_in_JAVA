class Emp{
    String name;
    int id;
    int salary;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}

public class Class_Problem {
    public static void main(String[] args) {
        Emp a = new Emp();
        a.setName("Sohom");
        a.salary = 344;
        System.out.println(a.getName());
        System.out.println(a.getSalary());

    }
}
