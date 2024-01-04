package TestingMySelf;

public class MergeTwoArray {

    public static void main(String[] args) {

        String cars [] [] = new String [2][3];

        //[R] [C]
        cars [0] [0]= "F -150";
        cars [0] [1]= "toyota";
        cars [0] [2]= "honda";

        //[R] [C]
        cars [1] [0]= "Ferrari";
        cars [1] [1]= "lambo";
        cars [1] [2]= "Tesla";



        for(int i=0; i<cars.length; i=i+1){
            System.out.println();
            for(int j=0; j<cars[i].length; j=j+1) {
                System.out.print(cars [i][j]+", ");


            }
        }

        }


        }



