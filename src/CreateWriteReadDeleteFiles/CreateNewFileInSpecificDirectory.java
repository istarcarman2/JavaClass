package CreateWriteReadDeleteFiles;

import java.io.File;

public class CreateNewFileInSpecificDirectory {

    public static void main(String[] args) {

       String[] students = {"mark", "john", "joshua", "jaden", "luke"}; // Created Array for names
        for (String student : students) { // Using for each loop
         NewDirectory(student+".txt");

        }
    }
            public static void NewDirectory(String StudentFileName){
            try {
                File f = new File("C:\\Users\\Owner\\Desktop\\carmanfiles\\"+StudentFileName);
                if (f.createNewFile()) {
                    System.out.println("file is successfully create " + f.getName());

                } else {
                    System.out.println("file already exit");
                }


            } catch (Exception e) {
                System.out.println("Something went wrong");
            }
        }
    }
