package lab9march;

public class StringOperation {
	public static void main(String[] args) {
		 String str = "Welcome to Java World";
		 //Returns the character at 5th position and display it.
		 char charAt5thPosition = str.charAt(5);
		 System.out.println("Character at 5th position: " + charAt5thPosition);
		// Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.
		  String compareString = "Welcome";
		  int compareResult = str.compareToIgnoreCase(compareString);
		  System.out.println("Comparison result with " + compareString + ": " + compareResult);
		  // Concatenates “- Let us learn” to the above string and display it.
		  String concatenatedString = str.concat(" - Let us learn");
	        System.out.println("Concatenated string: " + concatenatedString);

	        // Returns the position of the first occurrence of character ‘a’ and display it.
	        int firstOccurrenceOfA = str.indexOf('a');
	        System.out.println("Position of first occurrence of 'a': " + firstOccurrenceOfA);

	        // Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
	        String replacedString = str.replace('a', 'e');
	        System.out.println("Replaced string: " + replacedString);

	        // Returns string between 4th position and 10th position and display it.
	        String substring = str.substring(3, 10);
	        System.out.println("Substring between 4th and 10th position: " + substring);

	        // Returns the lowercase of the string and display it.
	        String lowercaseString = str.toLowerCase();
	        System.out.println("Lowercase string: " + lowercaseString);
	}
	
}
