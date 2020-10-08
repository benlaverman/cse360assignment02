package cse360assignment02;

public class AddingMachine {
  private int total;
  private String str = "0";
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  /**
   * Get the total
   * @return the total
   */
  public int getTotal () { // returns the total
    return total;
  }
  /**
   * Adds the value to the total
   * @param value is added to the total
   */
  public void add (int value) { 
	  str += " + " + value;
	  total += value;
  }
  /**
   * subtracts value from the total
   * @param value is subtracted from the total
   */
  public void subtract (int value) {
	  str += " - " + value;
	  total -= value;
  }
  /**
   * To String method converts to string
   */
  public String toString () {
    return str;
  }
  /**
   * clears the Machine
   */
  public void clear() {
	  total = 0;
	  str = "0";
  }
}
