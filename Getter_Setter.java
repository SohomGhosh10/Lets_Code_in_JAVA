class C{
    private String name;
    private int id;

    public String getName(){ // getter for returning value
        return name;
    }
    public void setName(String n){ // setter for setting the value
        name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }
}

public class Getter_Setter {
    public static void main(String[] args) {
        C c = new C();
        c.setName("Sohom");
        c.setId(123);
        System.out.println("Getters and setters are used to access and modify the attributes of any private class");
        System.out.println(c.getName());
        System.out.println(c.getId());

    }
}
