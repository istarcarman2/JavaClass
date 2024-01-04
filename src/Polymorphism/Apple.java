package Polymorphism;

public class Apple extends Orange{

    public void Orange() {
        System.out.println(" I love orange");
    }
    public static void main (String arg[]) {

        Apple obj = new Apple();
        obj.Orange();


    }
}
