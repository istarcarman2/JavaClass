package TestingMySelf;

public class FourMethods {

    public static void main(String[] args) {
        NoParameterNoReturnType1();

        ParameterAndNoReturnType(2023);

        String prefer = ParameterAndReturnType("cooking");
        System.out.println("my free time I do " + prefer);

        int total = NoParameterAndReturnType();
        System.out.println(200);
    }

    public static void NoParameterNoReturnType1() {
        String[] dresses = {"Sari", "Kurti", "Jeans", "dress", "keri", "Pajama"};
        System.out.println("I prefer to wear " + dresses[5]);
    }

    public static void ParameterAndNoReturnType(int birthYear) {
        int age = 1998 - birthYear;
        System.out.println("The age is " + age);
    }

    public static String ParameterAndReturnType(String pre1) {
        return pre1;
    }

    public static int NoParameterAndReturnType() {
        return 10;
    }

}

