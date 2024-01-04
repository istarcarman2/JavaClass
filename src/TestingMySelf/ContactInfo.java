package TestingMySelf;

import java.io.FileWriter;
import java.util.Scanner;

public class ContactInfo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter email address : ");
        String email = sc.nextLine();

        System.out.println("Enter phone number");
        String number = sc.nextLine();

// Save it to File
        try{
            FileWriter fw = new FileWriter("contact.txt",true);
            fw.write(name+ ","+email+number+"\n");
            fw.close();
            System.out.println("Contact "+name + " is successfully saved.");
        }catch (Exception ex){
            System.out.println("Something went wrong.");
        }

    }
}
