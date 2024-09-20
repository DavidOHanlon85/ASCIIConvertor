/**
 * 
 */
package challenge_ASCIIConverter;

import java.util.Scanner;

/**
 * 
 */
public class ASCIIConverterChallenge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare and initialise Variables
		
		int inputInt = 0;
		String inputString, inputName;
		char inputChar;
		
		// Instantiate Scanner
		
		Scanner myScan = new Scanner(System.in);
		
		//Set up Menu
		
		do {
			System.out.println("\nASCII Convertor Menu................");
            System.out.println("1. Show ASCII Table");
            System.out.println("2. Convert a Character to ASCII");
            System.out.println("3. Convert your name to ASCII");
            System.out.println("4. Quit");

            System.out.println("Enter a number and return");
            inputInt = myScan.nextInt();
            myScan.nextLine();
            
            switch (inputInt) {
            case 1:
            	// Display ASCII Chart
        		for (int i = 32; i <= 127; i++) {
        			System.out.println(i + ":\t" + (char) i);
        		}
            	break;
            case 2:
            	// Display ASCII value
            	System.out.println("What charachter would you like to convert to ASCII?");
            	inputString= myScan.nextLine();
            	inputChar = inputString.charAt(0);
            	System.out.println(inputChar + ":\t" +(int)inputChar);
            	break;
            case 3: 
            	// Display ASCII Name (No Spaces)
            	System.out.println("Type your name and we will convert it to ASCII (without spaces)");
            	inputName = myScan.nextLine();
            	for (int i = 0; i < inputName.length(); i++) {
        			if(inputName.charAt(i) == 32) {
        				continue;
        			}
        			System.out.println((int) inputName.charAt(i) + ":\t" + (char)inputName.charAt(i) );
            	}
            case 4:
            	System.out.println("You have quit the program. Goodbye.");
            	break;
            default:
            	System.out.println("Invalid entry. Please try again!");
            	break;
            } 

		} while (inputInt != 4);

		myScan.close();
	}

}
