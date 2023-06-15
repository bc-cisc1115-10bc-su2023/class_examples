/* Objective: Read in input from a file and display its contents.
   Then, display another word after printing out contents. 

   Also we will use methods to organize code
   
   The filename will come from args input
   The new word will also come from arguments
*/
import java.io.File;
import java.util.Scanner;

public class DisplayFileWithMethods {

  // method:openFile() will open file and scan input
  static Scanner openFile(String filename) throws Exception {
    return new Scanner(new File(filename));
  }

  // method:displayFile() will display tokens from file contents to screen
  private static boolean displayFile(Scanner s) {
    // while there are tokens, keep going
    while(s.hasNext()){
      // Print each token to the console screen

      String token = s.next(); // get the next token
      
      // display to the console screen    
      displaySingleWord(token);
    }
    return false;
  }

  protected static int displaySingleWord(String word){
    //System.out.print(word);
    System.out.printf("%s\n", word);
    return 1;  
  } 

  /*  main method throws Exception because we're working with files
      new File object may throw a FileNotFoundException if input file does not exist
      "throws Exception" is the simplest way to handle this exception
  */
  public static void main(String[] args) throws Exception {
    // Save arguments as names for easier readibility
    String filename = args[0];
    String newWord = args[1]; 
    
    // 1. Open file and scan input
    Scanner sc = openFile(filename);

    // 2. print to screen
    boolean b = displayFile(sc);

    // 3. Print the new word to screen 
    int i = displaySingleWord(newWord);

    System.out.println();
  }

}





