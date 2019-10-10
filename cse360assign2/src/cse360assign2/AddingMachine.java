/*
 * Name: Andrew Garza
 * ID: 1213817694
 * Seat: R A 8
 * Assignment Number: 2
 */

package cse360assign2;
/**
 * AddingMachine class that does basic mathematical functions and has
 * helper functions as well. Beyond the class itself, this project is intended
 * for practicing with version control systems
 * @author Andrew Garza
 *
 */
public class AddingMachine {
	
	private int total;
	private String history;
	/**
	 * Constructor setting the initial total equal to 0
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	/**
	 * returns the current total 
	 * @return
	 */
	public int getTotal () {
		return total;
	}
	/**
	 * adds a given value to the current total 
	 * @param value is the number the user wants to add
	 */
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
	/**
	 * subtracts a given value to the current total
	 * @param value is the number the user wants to subtract
	 */
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	/**
	 * Function that displays the history of adding and subtracting
	 */
	public String toString () {
		return history;
	}
	/**
	 * resets the current total and everything
	 */
	public void clear() {
		total = 0;
		history = "0";
	}
}