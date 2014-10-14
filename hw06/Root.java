///////////////////////////////////////////////////////////////////////////////////////
//  Anthony Piccione
//  [CSE 002] Homework 6 
//  Problem 2 Root.java
//  Takes the square root of a number that the user enters using the high / low method
//  Set loop sensitivity to .0000001 as the difference between high and low 

// import scanner
import java.util.Scanner ; 

// add class 
public class Root { 

    // add main method 
    public static void main (String [] args) {
        
        // create scanner object 
        Scanner scan = new Scanner (System.in) ; 
        
        //declare variables 
        double x = 0; 
        double low = 0 ; 
        double high = 0 ; 
        double middle = 0 ; 
        
        // while to force user to enter a number >= 0
        while (x <= 0) {
            // prompt user for input 
            System.out.print ("Please enter a number to find the square root of: "); 
            x = scan.nextDouble ();  
            if (x <= 0){
                System.out.println ("You did not enter a number greater than 0") ; 
            } // end if
        } // end while
        
        high = 1 + x ; 
        
        // run algorithm until it is in the range 
        while ((high - low) > .00000001*(1+x)) {
            // find the middle of the number
            middle = (low + high) / 2 ; 
            if ((middle * middle) > x) {
                high = middle ; 
            } // end if
            else {
                low = middle ; 
            } // end else 
        } // end while 
        
        System.out.printf ("The square root is: %1.4f \n", middle) ; 
    } // end main method 
} // end class 