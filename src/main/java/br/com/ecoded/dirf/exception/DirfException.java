package br.com.ecoded.dirf.exception;

// Exceção a ser lançada na ocorrência de falhas provenientes do DIRF.
public class DirfException extends Exception {

	private static final long serialVersionUID = 8157032997005835424L;

	String message;

	public DirfException(Throwable e) {
		super(e);
	}

	public DirfException(String message) {
		this((Throwable) null);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}