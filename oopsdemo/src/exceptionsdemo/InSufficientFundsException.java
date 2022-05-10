package exceptionsdemo;

//User defined Exception class

public class InSufficientFundsException extends Exception {
	
	/**
	 * 
	 */
	
private static final long serialversionUID = 1L;
private double amount;

public InSufficientFundsException(double amount) {
	this.amount = amount;
}

public static long getSerialversionuid() {
	return serialversionUID;
}

public double getAmount() {
	return amount;
}




}
