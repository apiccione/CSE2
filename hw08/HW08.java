///////////////////////////////////////////////////////////////////////////////////
//  Anthony Piccione
//  [CSE 002] Homework 08 
//  October 28, 2014
/*  Program gives practice using method and overloading methods */

// import the Scanner 
import java.util.Scanner ; 

// start class 
public class HW08 {
    
    // add main mehtod 
    public static void main (String [] args) {
        
        char input;
    	
    	// create the scanner
    	Scanner scan = new Scanner (System.in);
    	
    	// use the get input method to record user input 
    	input = getInput(scan, "Cc");
    	
    	// print out the user input 
    	System.out.println("You entered '" + input + "'");
    	
    	
    	// confirm user input using the getInput() method
    	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
    	
    	input = getInput(scan,"yYnN",5); //give up after 5 attempts
    	
    	
    	if(input != ' '){
       	    System.out.println("You entered '"+input+"'");
    	}
    	
    	
    	input=getInput(scan,"Choose a digit.","0123456789");
    	System.out.println("You entered '"+input+"'"); 
      
    } // end main method 
    
    // getInput Method, for Cc it using the Scanner 
    public static char getInput(Scanner scan, String parameters) {
        System.out.print("Please enter C or c to continue, anything else to quit ") ; 
        String userInput = scan.next () ; 
        char firstCharacter = (char) parameters.charAt (0) ;
        char secondCharacter = (char) parameters.charAt (1) ; 
        
        // test that the input is one character long
        while (!userInput.equals ("c") && !userInput.equals ("C")) {
            System.out.print("You did not enter a character from the list Cc, please try again: ") ; 
            userInput = scan.next() ; 
        } // end while loop 
        
        while(userInput.length () != 1 ) {
            System.out.print("You did not enter exactly one character, please try again: ") ; 
            userInput = scan.next () ; 
        } // end while 
        
        
        return userInput.charAt(0) ; 
    } // end getInt() Method
    
    // getInput method with a limit of five interations 
    public static char getInput(Scanner scan, String parameters, int numberOfRuns) {
        
        // collect user input 
        String input = scan.next() ;
        
        // check that the input is only one letter long 
        while (input.length() != 1) {
            System.out.print ("You did not enter a single character: ") ; 
            input = scan.next() ; 
        } // end while loop 
        
        // convert input to a char 
        char inputChar = (char) input.charAt(0) ; 
        
        // remove the individual leters from the string above 
        char first = parameters.charAt(0) ; 
        char second = parameters.charAt(1) ; 
        char third = parameters.charAt(2) ;
        char fourth = parameters.charAt(3) ;
        
        numberOfRuns = 1 ; 
        // check that the input is one of the choices 
        while (inputChar != first && inputChar != second && inputChar != third && inputChar != fourth ) {
            if (numberOfRuns < 5) {
                System.out.print("You did not enter one of the choices Y, y, n, n, please try again: ") ; 
                input = scan.next() ; 
                inputChar = input.charAt(0) ;
                numberOfRuns++ ; 
            }
            else {
                System.out.println ("You failed after five attempts." ) ; 
                return ' ' ; 
            } // end else 
        } // end while loop 
        
        return input.charAt(0) ; 
    } // end getInput method
    
    // getInt() method for the numbers
    public static char getInput(Scanner scan, String entry,  String parameters) {
        // prompt the user for input 
        System.out.print(entry + " from the range " + parameters + " ") ;  
        
        // collect user input 
        String input = scan.next() ;
        
        // check that the input is only one letter long 
        while (input.length() != 1) {
            System.out.print ("You did not enter a single character: ") ; 
            input = scan.next() ; 
        } // end while loop 
        
        // convert input to a char 
        char inputChar = (char) input.charAt(0) ; 
        
        // remove the individual leters from the string above 
        char first = parameters.charAt(0) ; 
        char second = parameters.charAt(1) ; 
        char third = parameters.charAt(2) ;
        char fourth = parameters.charAt(3) ;
        char fifth = parameters.charAt(4) ;
        char sixth = parameters.charAt(5) ;
        char seventh = parameters.charAt(6) ;
        char eigth = parameters.charAt(7) ;
        char ninth = parameters.charAt(8) ;
        char tenth = parameters.charAt(9) ;
        

        // check that the input is one of the choices 
        while (inputChar != first && inputChar != second && inputChar != third && inputChar != fourth && inputChar != fifth && inputChar != sixth && 
        inputChar != seventh && inputChar != eigth && inputChar != ninth && inputChar != tenth ) {
            System.out.print("You did not enter one of the choices Y, y, n, n, please try again: ") ; 
            input = scan.next() ; 
            inputChar = input.charAt(0) ;
        } // end while loop 
        
        return input.charAt(0) ; 
    } // end getInput method
    
    
    
} // end class