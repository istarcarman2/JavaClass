package TestingMySelf;

public class PrintLaptopDetails {

    public static void main(String[] args) {
        Laptop lp = new Laptop("9917-35c2-f15d-11cb-cc92-","Dell","32GB");
        lp.id = "9917-35c2-f15d-11cb-cc92-";
        lp.name = "Dell";
        lp.ram = "32GB";

        lp.display();
    }
}
