package aep.unicesumar.Conceito;

public class NotaException extends RuntimeException {
	
	public NotaException(Exception cause) {
		super("A nota inserida esta fora do intervalo 0.0 e 10.0", cause);
	}

}
