/* Sample program that reads in sample.csv, which contains dates for this class
   and prints out the dates in to report.txt */

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class ShowEvents {
  public static void displayToScreen(String s){
    System.out.println("-> " + s);
  }

  public static void printToFile(String s, PrintStream ps){
    ps.println(s);
  }
  public static void main(String[] args) throws Exception {
    // open the input file and parse
    Scanner in = new Scanner(new File("sample.csv"));

    // create an output file named report.txt to print into
    PrintStream ps = new PrintStream(new File("report.txt"));

    // for each record in the data file, print it
    while(in.hasNextLine()){
      String line = in.nextLine();
      displayToScreen(line);
      printToFile(line, ps); 
    }

  }

}
