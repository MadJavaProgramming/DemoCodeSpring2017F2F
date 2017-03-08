/** Test code for the InvoiceItem from project 2 
 * 
 *  @author pwaite
**/
public class InvoiceItemTest {

    /** test the invoice item calculation 
     *  @param args command line arguments
    **/
    public static void main(String[] args) {
        //create the invoice item
        InvoiceItem item = new InvoiceItem();
        
        //set the values
        item.setQuantity(2);
        item.setPrice(10.00);
        
        // create a variable for the actual value and call the method
        double actualTotal = item.calculateTotal();
        
        //create a variable with the expected value/result
        double expectedTotal = 20.00;
        
        //compare actual to expected
        if (actualTotal == expectedTotal) {
            System.out.println("Calculation - success");
        } else {
            System.out.println("Calculation - failure :(");
        }
    }
    
}

