/*
 * Name: Kidane Mussie
 * Class ID: 500
 * Assignment 2
 * This file contains the Calculator class. The Calculator class contains 
 * functions that perform arithmetic operations.
 */

package cse360assign2;
import java.util.ArrayList;

/**
 * Calculator is the class that allows for simple arithmetic operations to 
 * be performed. 
 * A Calculator object encapsulates the information needed for the various
 * arithmetic operations. This information includes:
 * <ul>
 * <li> The total value after an arithmetic operation is performed
 * <li> An array list to hold the history of operands and operators
 * </ul>
 * <p>
 * Operations which perform an addition by adding a user entered value to 
 * the current total.
 * Operations which perform a subtraction by subtracting a user entered
 * value from the current total.
 * Operations which perform a multiplication by multiplying the current total
 * by a user entered value.
 * Operations which perform a division by dividing the current total by a user
 * entered value.
 * Operations which return the total value by returning the current total.
 * Operations which return the history of the arithmetic operations that have
 * been performed.
 * <p>
 * An important point to consider is when the divide operation should divide
 * the total by zero, the total is set to zero.
 * 
 */
public class Calculator {
	
private int total;
private ArrayList<String> operationHistory = new ArrayList<String>();
	
	/**
	 * Class constructor that initializes the total to zero.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		operationHistory.add("0");
	}
	
	/**
	 * Returns the current total
	 * 
	 * @return total	the value that will be returned
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds the parameter value to the current total. This method also appends
	 * both the corresponding arithmetic operator and parameter value as 
	 * strings, to an array list.  
	 * 
	 * @param value		the value that will be added to the total
	 */
	public void add (int value) {
		
		total += value;
		operationHistory.add("+");
		operationHistory.add(Integer.toString(value));
		
	}
	
	/**
	 * Subtracts the parameter value from the current total value. This method
	 * also appends both the corresponding arithmetic operator and parameter 
	 * value as strings to an array list.
	 * 
	 * @param value		the value that will be subtracted from the total
	 */
	public void subtract (int value) {
		
		total -= value;
		operationHistory.add("-");
		operationHistory.add(Integer.toString(value));
		
	}
	
	/**
	 * Multiplies the current total by the parameter value. This method also
	 * appends both the corresponding arithmetic operator and parameter
	 * value as strings to an array list.
	 * 
	 * @param value		the value that the total will be multiplied by
	 */
	public void multiply (int value) {
		
		total *= value;
		operationHistory.add("*");
		operationHistory.add(Integer.toString(value));
		
	}
	
	/**
	 * Divides the current total by the parameter value. This method also
	 * appends both the corresponding arithmetic operator and parameter value
	 * as strings to an array list.
	 * 
	 * @param value		the value that the total will be divided by
	 */
	public void divide (int value) {
		
		if ( value == 0)
		{
			total = 0;
		}
		else
		{
			total /= value;
		}
		
		operationHistory.add("/");
		operationHistory.add(Integer.toString(value));
		
	}
	
	/**
	 * Returns a history of all operations as a string by iterating through the
	 * array list and concatenating each element with the history variable.
	 * 
	 * @return		all operations that have been performed
	 */
	public String getHistory () {
		
		String history = "";
		
		for(int i = 0; i < operationHistory.size(); i++)
		{
			history += operationHistory.get(i);
			history += " ";
		}
		
		return history;
	}

}
