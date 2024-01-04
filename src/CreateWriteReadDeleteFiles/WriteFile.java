package CreateWriteReadDeleteFiles;

import java.io.FileWriter;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Expenses: ");
        String Expenses = sc.nextLine();

        System.out.println("Enter Category: ");
        String Category = sc.nextLine();

        System.out.println("Enter Date :");
        String Date = sc.nextLine();


        try {
            FileWriter fw = new FileWriter("expenses.csv", true);
            fw.write(Expenses + "," + Category + " ," + Date +"\n");
            fw.close();
            System.out.println("DailyExpenses " + Expenses + " you waste.");
        } catch (Exception ex) {
            System.out.println("Something went wrong.");
        }

    }

}
