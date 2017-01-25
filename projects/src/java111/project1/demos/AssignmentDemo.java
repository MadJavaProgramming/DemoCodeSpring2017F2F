/** Assignment will demonstrate 
 *   - creating variables
 *   - assigning values to the variables
 *   - use an if/else to write out values
 * 
 * @author pwaite
 */
 
 public class AssignmentDemo {
 
 /** main method will create variables, assign value and use an if/else.
  * @param args the command line arguments
  */
    public static void main (String[] args) {
        int myNumber = 20;
        
        String greaterThan20 = "The number is greater than 20";
        String lessThan20 = "The number is less than than 20";
        String is20 = "The number is 20";
        
        if (myNumber > 20) {
            System.out.println(greaterThan20);
        } else if (myNumber < 20) {
            System.out.println(lessThan20);
        } else {
            System.out.println(is20);
        }
   }
 
 }
