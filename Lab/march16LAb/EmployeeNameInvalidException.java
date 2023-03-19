package march16LAb;

public class EmployeeNameInvalidException extends Exception {

	public EmployeeNameInvalidException() {
		super();
		
	}

	public EmployeeNameInvalidException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public EmployeeNameInvalidException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public EmployeeNameInvalidException(String message) {
		super(message);
		
	}

	public EmployeeNameInvalidException(Throwable cause) {
		super(cause);
		
	}

}

