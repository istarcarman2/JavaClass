package TestingMySelf;

import java.io.File;

public class FileCreateFunction {

    public static void main(String[] args) {

        String[] names = {"Mom", "Paul", "Istar", "Jaden","Joshua"}; // Created Array for names
        for(String name: names){ // Using for each loop
            createFile(name+".txt"); // Called createFile method
      //      deleteFile(name+"DE.txt");
        }


    }

    public static void createFile(String fileName){
        try{
            File f = new File("C:\\Users\\Owner\\Desktop\\ContactNumbers\\"+fileName); //Syntax for creating file
            if(f.createNewFile()){   // if
                System.out.println("File created successfully."); // Print
            }else{ // else
                System.out.println("File already exists."); // Print
            }
        }catch (Exception e){ // throw Exception
            System.out.println("Something went wrong while creating file."+e.getMessage()); // throw message
        }
    }

//    public static void deleteFile(String fileName){
  //      try{
  //          File f = new File("C:\\Users\\Owner\\Desktop\\ContactNumbers"+fileName);
   //         if(f.delete()){
      //          System.out.println("File deleted successfully.");
    //        }else{
    //            System.out.println("Error while deleting file.");
            }
   //     }catch (Exception e){
    //        System.out.println("Something went wrong while creating file."+e.getMessage());
    //    }
  //  }

//}
