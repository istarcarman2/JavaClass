package TestingMySelf;

public class Substract {

    public static void main(String[] args) {
        // Calling same method with same name but different signature.
        mul(10,10);
        mul(10,10,10);
    }

    public static void mul(int num1, int num2){
        int total = num1 * num2;
        System.out.println("Addition of two number = " +  total);
    }

    public  static void mul(int num1, int num2, int num3){
        int total = num1 * num2 * num3;
        System.out.println("Addition of three number = " + total);
    }

}
