package march16LAb;

public class CountryNotValidException extends Exception {

	public CountryNotValidException() {
		super();
		
	}

	public CountryNotValidException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public CountryNotValidException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public CountryNotValidException(String message) {
		super(message);
		
	}

	public CountryNotValidException(Throwable cause) {
		super(cause);
		
	}

}