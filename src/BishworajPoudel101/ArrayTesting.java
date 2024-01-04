package BishworajPoudel101;

import java.util.Scanner;

public class ArrayTesting {

    public static void main(String[] args) {
        String fruites[] = {"", "", "", "", "",};
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < fruites.length; i++) {
            System.out.println("Enter name of the fruties" + (i + 1) + " : ");
            fruites[i] = sc.nextLine();


        }
        for(int i = 0; i < fruites.length; i++){
            System.out.println(fruites[i]);


        }
    }
}