/*
* The logFoot program implements an application that takes the length
* and the width of a logfoot from the user and calculates the height.
*
* @author  Ben Whitten
* @version 1.0
* @since   2020-11-30 
*/

import java.util.Scanner;  // Import the Scanner class

public class LogFoot {
  /**
   * calculates the height.
   */
  static double calculations(double width, double length) {
    final int logFoot = 144;
    final double height = logFoot / (width * length);

    return height;
  }

  /**
   * This function handles the input and output of the program.
   */
  public static void main(String[] args) {
    try {
      //Getting the length and width from user.
      Scanner scan = new Scanner(System.in);
      System.out.println("Insert the width (in inches) of the log foot:");
      double width = scan.nextDouble();
      System.out.println();
      System.out.println("Insert the length (in inches) of the log foot:");
      double length = scan.nextDouble();

      if ((width <= 0) || (length <= 0)) {
        System.out.println();
        System.out.println("ERROR: Length and width cannot be less than or"
                           + " equal to 0");
      } else {
        // Getting the value back from calculations.
        double height = calculations(width, length);
        // Outputing the height.
        System.out.println();
        System.out.println("The height of the log foot is: " + height
                           + " inches.");
      }
    } catch (Exception e) {
      System.out.println();
      System.out.println("ERROR: Length and width cannot be string");
    }
  }
}
