class Employee{
    String name;
    int emp_id;
    int salary;
    public void printDetails(){
        System.out.println("My name is " + name);
        System.out.println("And employee id is " + emp_id);
    }

    public int getSalary(){
        return salary;
    }
}

public class Custom_Class {
    public static void main(String[] args) {
        System.out.println("Employee details");
        Employee emp = new Employee();

        Employee emp2 = new Employee();


        emp.name = "Sohom";
        emp.emp_id = 123;
        emp.salary = 34;

        emp2.name = "Srijan";
        emp2.emp_id = 10;
        int salary = emp2.getSalary();
        System.out.println(salary);
        emp.printDetails();
        emp2.printDetails();
    }
}
