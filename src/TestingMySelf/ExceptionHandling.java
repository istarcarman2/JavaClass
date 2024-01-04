package TestingMySelf;

public class ExceptionHandling {

    public static void main(String[] args) {

        try {
            String[] pets = {"cat", "dog", "parrot"};
            System.out.println(pets[3]);
        } catch (Exception e) {
            System.out.println("An exception happened!");
        }

    }
}
