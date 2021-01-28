import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

/**
 * Printing out date and time using java
 */

//Creating public prebookedcall class, which will give a response to say whether or not that is a valid time. 
public class prebookedcall {
	// This is main main method which rns all the code and will have a if statement to give the response for a valid time. 
	public static void main(String[] args) {
		// Creating local date and time object
		LocalDateTime myDateObj = LocalDateTime.now();
		// print the date and time before formatting
		System.out.println("Before formatting: " + myDateObj);
		// format date and time
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		// Creating a string format data variable equal to date object to format the date and time
		String formattedDate = myDateObj.format(myFormatObj);
		System.out.println("After formatting: " + formattedDate);
	}
}
