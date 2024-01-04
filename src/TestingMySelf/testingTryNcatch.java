package TestingMySelf;

import java.util.Scanner;

public class testingTryNcatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("how old are you ?");

        try {

            int age = sc.nextInt();
            int birthYear = 2023-age;
            System.out.println("your birth year is :"+ birthYear);
        } catch (Exception e) {
            System.out.println("error");


        }

    }
}