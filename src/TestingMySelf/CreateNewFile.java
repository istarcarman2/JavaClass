package TestingMySelf;

import java.io.File;

public class CreateNewFile {

    public static void main(String[] args) {

        String[] colors = {"red", "green", "yellow"}; // Created Array for names
        for (String cl : colors) { // Using for each loop
        file(cl+"colors.txt");
        }
    }

      public static void file(String colornames)  {

          try{
              File f = new File("colors.txt"+colornames);
              if(f.createNewFile()){
                  System.out.println("file is successfully create "+ f.getName());

              }else {
                  System.out.println("file already exit");
              }


          }catch(Exception e ){
              System.out.println("Something went wrong");
          }

      }
    }

