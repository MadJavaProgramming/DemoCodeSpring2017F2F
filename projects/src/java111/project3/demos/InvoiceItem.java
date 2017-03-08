/** Represents a single item on an invoice -  project 2 
 * 
 *  @author pwaite
**/
public class InvoiceItem {
    private double price;
    private int quantity;
    
	/**
	 * Returns the value of price.
	 */
	public double getPrice() {
		return price;
	}


	/**
	 * Sets the value of price.
	 * @param price The value to assign price.
	 */
	public void setPrice(double price) {
		this.price = price;
	}


	/**
	 * Returns the value of quantity.
	 */
	public int getQuantity() {
		return quantity;
	}


	/**
	 * Sets the value of quantity.
	 * @param quantity The value to assign quantity.
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	/** calculate line item (price * quantity)
	 *  @return the total
	 */
	 public double calculateTotal() {
	     return price * quantity;
	 }

	
    
}

