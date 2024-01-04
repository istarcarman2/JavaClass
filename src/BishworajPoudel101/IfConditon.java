package BishworajPoudel101;

import java.util.Scanner;

public class IfConditon {

    public static void main(String []args){

        System.out.println("what color is the light");
        Scanner sc = new Scanner(System.in);
        String light = sc.next();

        if(light.equalsIgnoreCase("green")){
            System.out.println("I will keep driving");
        }
        if(light.equalsIgnoreCase("red")){
            System.out.println("stop the car");
        }
        if(light.equalsIgnoreCase("yellow")){
            System.out.println("slow down");
        }
        System.out.println("bye");

    }
    }









