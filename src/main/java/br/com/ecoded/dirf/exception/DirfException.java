package br.com.ecoded.dirf.exception;

/**
 * Exceção a ser lançada na ocorrência de falhas provenientes do DIRF.
 */
public class DirfException extends Exception {

	private static final long serialVersionUID = 8157032997005835424L;

	String message;

	/**
	 * Construtor da classe.
	 * 
	 * @param e
	 */
	public DirfException(Throwable e) {
		super(e);
	}

	/**
	 * Construtor da classe.
	 * 
	 * @param code
	 */
	public DirfException(String message) {
		this((Throwable) null);
		this.message = message;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}