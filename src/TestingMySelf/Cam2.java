package TestingMySelf;

public class Cam2 {
    private String name;
    private String color;
    private double price = 300.00;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {

        Cam2 obj = new Cam2();
        System.out.println(obj.getName());
        System.out.println(obj.getColor());
        System.out.println(obj.getPrice());

    }

}
