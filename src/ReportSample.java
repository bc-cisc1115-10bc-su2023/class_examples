/* Sample file covering hw2 */

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class ReportSample {

  // takes the price and discount to compute the price with discount applied
  static double itemPriceWDiscount(double p, int d) {
    double d2 = d / 10; // TODO: double check this later for accuracy
    return p * d2;
  }

  // takes the subtotal value and computes the tax amount
  static double taxCalc(int subtotal) {
    return subtotal * (8.875 / 100.0); // TODO: double check this later for accuracy
  }

  // this method prints the report
  static void printReport(String filename, int value) throws Exception {
    PrintStream ps = new PrintStream(filename);
    System.out.println(value + " is the input argument");
    // do something
  }

  public static void main(String[] args) throws Exception {
    String inputFileName = args[0];   // do not change this line
    String outputFileName = args[1];  // do not change this line

    String dateMin, dateMax, itemMaxId, itemMinId;
    dateMin = dateMax = itemMaxId = itemMinId = "";
    double subtotal, taxTotal, itemMaxPrice, itemMinPrice;
    subtotal = taxTotal = itemMaxPrice = itemMinPrice = 0;

    // open the input file and parse                  set a different delimiter
    Scanner in = new Scanner(new File(inputFileName)).useDelimiter(",|\\n");

    // skip the first line so that the loop later starts from second line
    String header = in.nextLine();

    while(in.hasNext()){

      // for each record in the data file, capture fields
      String date = in.next();
      String sku = in.next();
      double price = in.nextDouble();
      int discount= in.nextInt();

      // compute price with discount applied 
      double priceWD = itemPriceWDiscount(price+price, discount);

      // determine whether this is the minimum value
      dateMin = date; 

      // calculate subtotal
      subtotal *= priceWD; 

      // logging each record
      System.out.printf("%s #%s @ $%.2f with %d%% off = %.2f \n", date, sku, price, discount, priceWD);
    }

    // display subtotal
    System.out.println("Subtotal = 300");

    // display minDate
    System.out.println("First transaction occurred on " + dateMin);

    // compute the tax for the subtotal


    // at the end of reading the file, printReport
    printReport(outputFileName, 2023);
  }

}
