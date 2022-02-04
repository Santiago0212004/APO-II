package exception;

public class NegativeNumberException extends Exception{
	public NegativeNumberException() {
		super("No puede añadir una cantidad negativa");
	}
}
