package TestingMySelf;

public class Encapsulation {

    private String Istar;

    public String getIstar() {
        return Istar;
    }

    public void setIstar(String istar) {
        Istar = istar;
    }

    public static void main(String args[]) {
        Encapsulation obj = new Encapsulation();
        obj.setIstar("trying to figure how to acheive getter and setter");
        System.out.println(obj.getIstar());
    }
}
