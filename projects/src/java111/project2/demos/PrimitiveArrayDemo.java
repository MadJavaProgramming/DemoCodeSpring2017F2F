/** Demo of an array of primitives 
 *  @author pwaite
 */
 public class PrimitiveArrayDemo {
     /** method to create an array of double 
      *  iterate over the array displaying each item in the array
      *
      *  @param args command line arguments
      */
      public static void main(String[] args) {
          double[] myDoubles = new double[5];
          myDoubles[0] = 10.99;
          myDoubles[1] = 11.99;
          myDoubles[2] = 12.99;
          myDoubles[3] = 13.99;
          myDoubles[4] = 14.99;
          
          int counter = 0;
          while (counter < myDoubles.length) {
              System.out.println("The value at index " + counter + ": " + myDoubles[counter]);
              counter++;
          }       
      }
 }
