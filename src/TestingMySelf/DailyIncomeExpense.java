package TestingMySelf;

import java.io.FileWriter;
import java.util.Scanner;

public class DailyIncomeExpense {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter income: ");
            String Income = sc.nextLine();

            System.out.println("Enter Category: ");
            String Category = sc.nextLine();

            System.out.println("Enter Date :");
            String Date = sc.nextLine();


            try {
                FileWriter fw = new FileWriter("income.csv", true);
                fw.write(Income + "," + Category + " ," + Date +"\n");
                fw.close();
                System.out.println("DailyExpenses " + Income + " is successfully saved.");
            } catch (Exception ex) {
                System.out.println("Something went wrong.");
            }

        }

    }