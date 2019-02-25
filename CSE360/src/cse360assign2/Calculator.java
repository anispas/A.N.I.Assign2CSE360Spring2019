/**
 * Name: Allaina Ispas
 * ID: 1213729359
 * Description: This program functions as that of a normal calculator
 * 
 * Due: 2/25/19
 * 
 * Edits to code noted at the end of class
 */
package cse360assign2;

public class Calculator {
	
	/**
	 * Initializes the int value total
	 */
	 private int total;
	
	/**
	 * Initializes the String value entered
	 * 
	 */
	private String entered = "0"; 
	
	/**
	 * Initializes the Calculator method
	 */
	public Calculator () {
		
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Returns the total as calculated
	 * @return total
	 */
	public int getTotal () {
		
		return total;
		
	}
	
	/**
	 * A method that adds the value to the total
	 * @param value
	 */
	public void add (int value) {
		
		total += value;
		entered = entered + " + " + value;
	}
	
	/**
	 * A method that subtracts the value from the total
	 * @param value
	 */
	public void subtract (int value) {
		
		total -= value;
		entered = entered + " - " + value;
	}
	
	/**
	 * A method that multiples the value and the total
	 * @param value
	 */
	public void multiply (int value) {
		
		total = total*value;
		entered = entered + " * " + value;
	}
	
	/**
	 * A method that divides the total by the value
	 * @param value
	 */
	public void divide (int value) {
		

		if(value == 0) {
			
			total = 0;
			
		} else {
			
			total = total/value;
		}
		entered = entered + " / " + value;
	}
	
	/**
	 * This method returns the history of what was calculated in the method
	 * @return The string of values used 
	 */
	public String getHistory() {
		
		return entered;
	}
	
}

/**
 * *******EDITS*******
 * Added code to add, subtract, divide, and multiply methods
 * Added the entered string method
 * Added the entered string to the methods
 * Added code to String getHistory() to return code
 * 
 */
