import java.util.ArrayList;
import java.util.Scanner;

public class CityNames {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // User input

        ArrayList<String> cityNames = new ArrayList<>(); // ArrayList Syntax

        System.out.println("How many Cites names are you going to enter : "); // Print how many
        int beautifulCities = scan.nextInt(); // Interger variable
        for(int i = 0; i<beautifulCities;i++){ // looping
            System.out.println("Enter City name"); // Print cities names

            Scanner sc = new Scanner(System.in); // User input
            String cites = sc.nextLine(); // String variable
            cityNames.add(cites);

        }
        System.out.println("All the cities names are : ");
        for(String Cites : cityNames){
            System.out.println(Cites);
        }

        }

    }

