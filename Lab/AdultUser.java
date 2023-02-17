package lab;//package name 


public class AdultUser implements LibraryUser {// adultuser class implementing libraryuser interface
	int age;
	String bookType;

	@Override
	public void  registerAccount(int age) {// implementing registerAccount method
		this.age=age;
		if (age>12) {
			System.out.println("You have successfully registered under an Adult Account");
			
		}
		else {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
			
		}
		
		
	}

	@Override
	public void requestBook(String bookType){// implementing requestBook method
		this.bookType=bookType;
		
		if(bookType.equalsIgnoreCase("Fiction")) {
			System.out.println("Book Issued successfully, please return the book within 7 days");
			
		}
		else
		{
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
		
	}

}
