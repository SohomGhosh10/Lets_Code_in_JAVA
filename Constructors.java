public class Constructors {
    public static void main(String[] args) {
        MyBio mb = new MyBio("Sohom" , 64);
       // mb.setRoll(64);
        System.out.println(mb.getRoll());
        //mb.setName("Sohom");
        System.out.println(mb.getName());
    }
}

class MyBio{
    String name;
    int roll;

   public MyBio(){ // non- parameterized Constructor
        name = "Sohom";
        roll = 64;
    }
   public MyBio(String Myname , int r){ // Constructor overloading
       name = Myname;
       roll = r;
   }

   public MyBio(int r){ // Constructor overloading
       roll = r;
   }
    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name = n;
    }

    public int getRoll(){
        return roll;
    }

    public void setRoll(int r){
        this.roll = r;
    }
}
