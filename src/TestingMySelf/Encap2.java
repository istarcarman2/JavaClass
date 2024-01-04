package TestingMySelf;

public class Encap2 {
    private int a = 10;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
        System.out.println(a);
    }

    public static void main(String[] args) {

        Encap2 obj = new Encap2();
        obj.setA(20);
        System.out.println(obj.getA());

    }
}
