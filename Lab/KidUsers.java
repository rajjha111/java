package lab;//package name 

//kiduser class implementing libraryuser interface
public class KidUsers implements LibraryUser {
	int age;
	String bookType;
     
	public void  registerAccount(int age){// Implementing registerAccount method
		this.age=age;
		if (age<12) {
			System.out.println("You have successfully registered under a Kids Account");
			
		}
		else {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
			
		}
		
	}

	public void requestBook(String bookType) {// Implementing requestBook method
		this.bookType=bookType;
		if (bookType.equalsIgnoreCase("kids")) {
			System.out.println("Book Issued successfully, please return the book within 10 days");
			
		}
		else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
		
	}

}
