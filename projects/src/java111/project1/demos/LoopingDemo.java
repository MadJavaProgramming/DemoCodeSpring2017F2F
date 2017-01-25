/** Demonstrate looping using while and also 
        to demonstrate print vs. println
 * 
 * @author pwaite
 */
 
 public class LoopingDemo {
 
 /** main method will 
    - create a variable
    - assign value (a number)
    - use that variable in a while loop
    - print out the value of variable in the loop
    - demonstrate use of println versus print        
  * @param args the command line arguments
  */
    public static void main (String[] args) {
       int counter = 10;
       
       // loop as long as counter > 0
       while (counter > 0) {
           System.out.println("The counter is " + counter);
           System.out.println();
           counter--;
           // line 26 could also be written as
           // counter = counter -1;
           // counter-=1;
       }
       //Demonstrating print versus println
        System.out.print("Demonstrating a System.out.print");
        System.out.println("Demonstrating a System.out.println");  
   }
 
 }
