import java.util.Scanner;
package arraydemo;

/**
 * Commenting for modification on Jan 17
 * Date - Jan 10,2024
 * @author bharat
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter a word");
        Scanner input = new Scanner(System.in);
        
        String myWord = input.nextLine();
        
        char[] myLetters = new char[myWord.length()];
        
        for (int i = 0; i<myLetters.length; i++){
             myLetters[i] = myWord.charAt(i);
             }
        
        System.out.println("Printing in reverse");
        System.out.println("Hello World!");
    }
    
}
