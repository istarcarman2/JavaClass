import java.util.ArrayList;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        ArrayList<String> fruites = new ArrayList<String>();
        System.out.println("Enter how many fruites: ");
        int totalFruites = sc.nextInt();
        for(int i = 0; i<totalFruites;i++){
            System.out.println("Enter Fruit: ");
            String fruit = sc1.nextLine();
            fruites.add(fruit);

        }
        System.out.println("All fruites are : ");
        for(String fruite:fruites){
            System.out.println(fruite);

        }



    }
}
