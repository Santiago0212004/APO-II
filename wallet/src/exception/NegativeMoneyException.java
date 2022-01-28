package exception;

public class NegativeMoneyException extends Exception{
	
	public NegativeMoneyException() {
		super("No puede retirar cantidades negativas");
	}
	
}
