package TestingMySelf;

public class Laptop {

    String id;
    String name;
    String ram;


    public Laptop(String id,String name, String ram){
        this.id = id;
        this.name = name;
        this.ram = ram;


    }

    void display(){
        System.out.println("print laptop id " + this.id);
        System.out.println("print laptop name " +this.name);
        System.out.println("print laptop ram " +this.ram);
    }
}
