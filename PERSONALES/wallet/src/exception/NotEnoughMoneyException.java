package exception;

public class NotEnoughMoneyException extends Exception{
	
	public NotEnoughMoneyException(double saldo, double gasto) {
		super("Falta dinero. Usted tiene: "+saldo+". E intento gastar: "+gasto);
	}
}
