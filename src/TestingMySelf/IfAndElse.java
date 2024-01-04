package TestingMySelf;

import java.util.Scanner;

public class IfAndElse {
    public static void main(String[] args) {
        System.out.println("what dress are you going to wear");
        Scanner sc = new Scanner(System.in);
        String dress = sc.next();
        if(dress.equalsIgnoreCase("pink")){
            System.out.println("wear it");
        }
        else{
            System.out.println("second option wear yellow");
        }
    }
}
