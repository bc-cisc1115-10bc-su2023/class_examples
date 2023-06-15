/* Objective: Open a text file (from filename provided) and display its contents word by word.
   Then, display another word after printing out contents. 
   
   The filename will come from args input
   The new word will also come from arguments
*/
import java.io.File;
import java.util.Scanner;

public class DisplayFile {

  /*  main method throws Exception because we're working with files
      new File object may throw a FileNotFoundException if input file does not exist
      "throws Exception" is the simplest way to handle this exception
  */
  public static void main(String[] args) throws Exception {
    // Save arguments as names for easier readibility
    String filename = args[0];
    String newWord = args[1]; 
    
    // 1. Open file and scan input
    File f = new File(filename); // Open file with filename
    Scanner sc = new Scanner(f);
    /* One line version would look like
       Scanner sc = new Scanner(new File(filename));
     */

    // 2. print to screen
    // while there are tokens, keep going
    while(sc.hasNext()){
      // Print each token to the console screen

      String token = sc.next(); // get the next token
      
      // display to the console screen    
      System.out.printf("%s ", token);
    }

    // 3. Print the new word to screen 
    System.out.println(newWord);
  }

}





