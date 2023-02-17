package lab;//package name 


public class LibraryInterfaceDemo {// LibraryInterfaceDemo class to test the implementation

	public static void main(String[] args) {
		 // Test case 1
        // Creating KidUser object and testing registerAccount method
	
		KidUsers KidUsers=new KidUsers();
		KidUsers.registerAccount(10);
		KidUsers.registerAccount(18);
		 // Testing requestBook method for kidUser
		KidUsers.requestBook("kids");
		KidUsers.requestBook("Fiction");
		// Test case 2
        // Creating AdultUser object and testing registerAccount method
        AdultUser adultUser = new AdultUser();
        adultUser.registerAccount(5);
        adultUser.registerAccount(23);
        
        // Testing requestBook method for adultUser
        adultUser.requestBook("Kids");
        adultUser.requestBook("Fiction");
		
	}

}
