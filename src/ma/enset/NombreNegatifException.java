package ma.enset;

public class NombreNegatifException extends Exception {
	
	private String message;	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public NombreNegatifException(String message) {
		super(message);
		this.message = message;
	}

}
