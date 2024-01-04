package BishworajPoudel101;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInPut {

    public static void main(String[]args){

        Scanner abc = new Scanner(System.in);

        System.out.println("Tell me your address: ");
        String address = abc.nextLine();
        System.out.println("Your address is "+ address);

    }
}
