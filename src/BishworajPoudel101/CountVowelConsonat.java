package BishworajPoudel101;

public class CountVowelConsonat {
    public static void main(String[] args) {

        int vCount = 0; // Storing Vowels and Constant
        int cCount = 0;

        String str = "Istar Carman";  // Declare a String

        str = str.toLowerCase();   //converting entire string to lower case
        for (int i = 0; i < str.length(); i++) {  // checking weather a character is a vowel
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
          vCount++;  // increment the vowels count
            }
            else if(str.charAt(i)>='a'&& str.charAt(i)<='z'){
            }
            cCount++; // increment the constant count

        }
        System.out.println("Number of Vowels: " + vCount);
        System.out.println("Number of Consonant: " + cCount);

        }
    }