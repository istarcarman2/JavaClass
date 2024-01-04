package TestingMySelf;

import java.io.File;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {
        File myObj = new File("contact.txt"); // contact.txt will read the path
        try {
            Scanner reader  = new Scanner(myObj);
            while(reader.hasNextLine()){

                String mydata = reader.nextLine();
                System.out.println(mydata);
            }
            reader.close();
        }catch (Exception ex) {
            System.out.println("Error");
        }


    }
}
