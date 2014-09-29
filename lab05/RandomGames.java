////////////////////////////////////////////////
// Anthony Piccione
// [CSE 002]
// September 26, 2014
// Lab 05 - Random Games

// Import the Scanner 
import java.util.Scanner ; 

// add class 
public class RandomGames {
    
    // add main method
    public static void main(String [] args) {
        
        // declare instance of new scanner object 
        Scanner myScanner ; 
        
        // call new scanner constructor 
        myScanner = new Scanner(System.in) ; 
        
        // prompt for user input on the game 
        System.out.print ("Enter R or r for Roulette, C or c for craps, P or p for pick a card: "); 
        
        // collect user input 
        String userInput = myScanner.next () ; 
        
        // check that user input is R, r, C, c, P or p 
        if  (userInput.equals ("R") || userInput.equals ("r")) {
            int rouletteNumber = (int) (Math.random () * 37) ;  
            switch (rouletteNumber) {
                case 37: System.out.println("Roulette: 00") ; break ; 
                default: System.out.println("Roulette: " + rouletteNumber); break ;
            } // end switch statement
            
        } // end if statement 
        
        else if (userInput.length () != 1) {
            System.out.println ("A single Character is expected.") ; 
            return;
        } // end else if statement 
        
        else if (userInput.equals ("C") || userInput.equals ("c")) {
            System.out.println ("Craps option is yet to be impletmented.") ; 
            return;
        } // end else if statement 
        
        else if (userInput.equals ("P") || userInput.equals ("p")) {
            System.out.println ("Pick a card option is yet to be impletmented.") ; 
            return;
        } // end else if statement
        
        else {
            System.out.println (userInput + " is not one of 'R', 'r', 'C', 'c', 'P', or 'p'") ; 
        } // end else statement
        
    } // end main method
} // end class