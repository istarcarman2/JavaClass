package BishworajPoudel101;

import java.util.Scanner;

public class EnterPrice {
    public static void main(String[]args){

        Scanner abc= new Scanner(System.in);
        System.out.println("enter your budget: ");
        int price = abc.nextInt();

        if(price>500){

            System.out.println("budget is high");
        }else{
            System.out.println("budget is ok");


        }


    }
}
