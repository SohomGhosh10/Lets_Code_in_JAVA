class Employee{
    String emp_name;
    int emp_id;
    float emp_salary;
    float gross_salary;

    public void setName(String emp_name){
        this.emp_name = emp_name;
    }
    public String getName(){
        return emp_name;
    }
    public void setId(int emp_id){
        this.emp_id = emp_id;
    }
    public int getId(){
        return emp_id;
    }
    public float getSalary(){
        return emp_salary;
    }
    public void setSalary(float emp_salary){
        this.emp_salary = emp_salary;
    }

    public float getGSalary(){
        return gross_salary;
    }
    public float setGSalary(float emp_salary){
        float base_salary = 30.0f;
        return emp_salary + base_salary;
    }
}

public class Class_Problem {
    public static void main(String[] args) {
    Employee em = new Employee();
        em.setName("Sohom Ghosh");
        System.out.println("Name is " + em.getName());

        em.setId(1234);
        System.out.println("Employee id is " + em.getId());

        em.setSalary(20.0f);
        System.out.println("Salary is " + em.getSalary());
        System.out.println("Gross salary is " + em.getGSalary());
    }
}
