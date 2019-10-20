package experiments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Tests the gator's choice of tonics.
 *
 * @author {YOUR NAME HERE}
 */
public class TestTonic {
  
  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Declare file and scanner objects.
    File testResults = null;
    Scanner input = null;
    // Connect file contents to Scanner object.
    try {
      testResults = new File("inputs/results.list");
      input = new Scanner(testResults);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    
    /*
     * TODO Initialize identifiers to track:
     *      - count of iterations of while loop
     *      - number of successful tests
     *      - number of failing tests
     *      - boolean to hold the Scanner input
     */
    
    /*
     * TODO Set up:
     *      - while loop to use .hasNext() method of Scanner (iterator)
     *      In the while loop:
     *      - use boolean created above to store the scanner input
     *      - if statement to track if a test worked or failed
     *      - a printed progress report every 10 iterations
     *      - use identifer set up above to track number of iterations completed
     */
    
    /*
     * TODO Create Fraction (rational number) object(s) representing:
     *      - number of successes out of the number of iterations
     *      - number of failures out of the number of iterations
     */
     
    // TODO Complete the final report
    System.out.println();
    System.out.println("Worked in " + /* TODO success fraction */ + " cases (" 
                       + /* TODO percent succeeding */ + ")");
    System.out.println("Failed in " + /* TODO failure fraction */ + " cases ("
                       + /* TODO percent failing */ + ")");    
  }
  
  /** Updates console with progress report.
   *
   * @param works Number of times the tonic has worked
   * @param count Number of times the tonic has been tried
   */
  public static /* TODO return type */ progress(int works, int count) {
    // TODO Create progress report
  }
}