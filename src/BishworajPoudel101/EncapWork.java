package BishworajPoudel101;

public class EncapWork {
    public static void main(String[] args) {
        Kitchen k1 = new Kitchen();
        k1.setWidth(100);
        k1.setLength(300);
        k1.calculateArea();
    }
}

class Kitchen{
    // Properties
    private double width;
     private double length;

    void calculateArea(){
        double area = this.width * this.length;
        System.out.println("Area is "+area);
    }


    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
}