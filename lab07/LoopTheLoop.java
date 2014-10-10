/////////////////////////////////////////////////////////////////////////////////
//  Anthony Piccione
//  [CSE 002] Lab 07 
//  November 10, 2013
//  Series of nested while loops and use of the break statement 
//  Prints out a number "*"'s based on user input  

// import the scanner 
import java.util.Scanner ; 

// add class 
public class LoopTheLoop { 

    // add main method 
    public static void main (String [] args) { 
    
    // create scanner
    Scanner myScanner = new Scanner (System.in) ;     

    // declare variables 
    int nStars ; 
    int nStars2 ;
    String playAgain ; 
    
    while (true) {
        // prompt the user for input 
        System.out.print("Plese enter an int in the range (1-15): ") ; 
        nStars = myScanner.nextInt () ; 
        /* set second nStar variable equal to the first 
        (ensures it does not change the original during the following nested loops) */
        nStars2 = nStars ; 
        // next loop prints out the total number of stars 
        while (nStars2 > 1) {
            System.out.print("*") ; 
            nStars2-- ; 
        } // end loop 
        
        // prints first star of sequence 
        System.out.println ("*") ; 
        int A = 0; 
        
        while (A < nStars ) {
            int B = A ; 
            // prints the cascading starts, increasing to the number that the user choose 
            while (B > 0) {
                System.out.print("*") ; 
                B-- ; 
            } // end loop 
            
            System.out.println("*") ; 
            A++ ; 
        } // end loop 
        
        // prompt the user if they want to play again 
        System.out.print ("Enter 'y' of 'Y' to go again: ") ; 
        playAgain = myScanner.next() ; 
        // tests response and reruns the loop if the user chooses yes 
        if (playAgain.equals ("y")) { 
        } // end switch 
        else if (playAgain.equals ("Y")) { 
        }// end else if 
        else { 
        break ; // end the loop if the user chooses any other letter but y or Y 
        } // end else 
        
    } // end loop
    
    } // end main method 
    
} // end class 
