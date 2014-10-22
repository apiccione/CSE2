///////////////////////////////////////////////////////////////////////////////////
//  Anthony Piccione
//  [CSE 002] - Homework 07
//  October 21, 2014
//  Force the user to enter an integer between 1 and 9
//  print out three number stacks, one using while loops, one using for loops 
//  and one using do-while loops 
//  number stacks print 1 - 222 (two times) --- 33333 (three times) ----- 4444444 
//  (4 times) etc until the number the user enters is reached 

// import the scanner 
import java.util.Scanner ; 

// add class 
public class NumberStack {
    
    // add main method 
    public static void main(String [] args) {
        
        // create scanner object 
        Scanner scan = new Scanner (System.in); 
        
        // declare the needed variables 
        int number = 0 ; // stores the number that the user enters
        int spaces = 0; // controls the loop and determines the number of spaces needed 
        int x = 0 ; // controls the number of rows for the for loop 
        int y = 0 ; // controls the number of numbers printed in the for loop 
        int z = 0 ; // controls the spaces before numbers for the for loop
        int y1   = 0 ; // controls the number of numbers of dashes in the for loop 
        int z1 = 0 ; // controls the spaces before dashes for the for loop
        
        // runs the program until the right number is entered 
        while (number < 1 || number > 9) {
            // prompt the user to enter an integer between 1 - 9 
            System.out.print("Please enter an integer from 1 - 9: ") ; 
        
            // test that the number is an int
            if (scan.hasNextInt ()) {
                number = scan.nextInt () ; 
            } // end if 
            else {
                System.out.println ("You did not enter an int.") ; 
                return ; 
            } // end else 
            // test that the number is in the range
            if (number < 1 || number > 9 ) {
                System.out.println ("You did not enter an integer in the range.") ; 
            } // end if 
        } // end loop 
        
        // declare variable for the number of spaces 
        spaces = number ; 
        
        // print stack using for loop
        System.out.println ("Using the For loop method : ") ; 
                
        // determine to number of rows in the stack that will be printed 
        for (x = 1 ; x <= number ; x++) {
            
            // loop to print out the spaces before the numbers 
            for (z = spaces ; z >= 0 ; z--) {
                System.out.print( " " ) ; 
            }// end for loop 
            
            // loop to print the numbers 
            for (y = 0 ; y < x * 2 - 1 ; y++) {
                System.out.print (x) ; 
            }// end for loop
            
            // moves to the next line 
            System.out.print ("\n") ;
            
            // loop to print out the spaces before the dashes
            for (z1 = spaces ; z1 >= 0 ; z1--) {
                System.out.print( " " ) ; 
            }// end for loop 
            
            // loop to print the dashes 
            for (y1 = 0 ; y1 < x * 2 - 1 ; y1++) {
                System.out.print ("-") ; 
            }// end for loop
            
            // moves to the next line 
            System.out.print ("\n") ;
            spaces-- ; 
        } // end for loop 
        
        // variables for the while loop 
        int spacesW = 0 ; // controls the number of spaces 
        int xW = 1 ; // controls the number of rows for the for loop 
        int yW = 0 ; // controls the number of numbers printed in the for loop 
        int zW = 0 ; // controls the spaces before numbers for the for loop
        int y1W = 0 ; // controls the number of numbers of dashes in the for loop 
        int z1W = 0 ; // controls the spaces before dashes for the for loop
        
        // print stack using the while loop 
        System.out.println ("Using the while loop method:") ; 
        
        spacesW = number ; 
        
        // contols the number of stacks 
        while (xW <= number) {
            // print the number of spaces before a number
            zW = spacesW ; 
            while (zW >= 0) {
              System.out.print(" ") ; 
              zW-- ; 
            } // end while loop
            // print out the numbers 
            yW = 0 ; 
            while (yW < xW * 2 - 1) {
                System.out.print(xW) ; 
                yW++ ;
            } // end while loop
            System.out.println() ; 
        
            // spaces for the dashes 
            z1W = spacesW ; 
            while (z1W >= 0) {
                System.out.print(" ") ; 
                z1W-- ; 
            } // end while loop
            
            // print the dashes
            y1W = 0 ; 
            while (y1W < xW * 2 - 1) {
                System.out.print ("-") ; 
                y1W++ ; 
            } // end while loop
            System.out.print("\n") ; 
            xW++ ; 
            spacesW--; 
       
        } // end while loop
        
        // print stack using Do While Loops 
        System.out.println("Using the do while loop method.") ; 
        
        // variables for the while loop 
        int spacesDW = 0 ; // controls the number of spaces 
        int xDW = 1 ; // controls the number of rows for the for loop 
        int yDW = 0 ; // controls the number of numbers printed in the for loop 
        int zDW = 0 ; // controls the spaces before numbers for the for loop
        int y1DW = 0 ; // controls the number of numbers of dashes in the for loop 
        int z1DW = 0 ; // controls the spaces before dashes for the for loop
        
        spacesDW = number ; 
        // Controls the number of stacks 
        do {
            // print spaces for numbers 
            zDW = spacesDW ; 
            do {
                System.out.print (" ") ; 
                zDW-- ; 
            } while (zDW >= 0) ; 
            
            // print numbers 
            yDW = 0 ; 
            do {
                System.out.print(xDW) ; 
                yDW++ ; 
            } while (yDW < xDW * 2 - 1) ; 
            
            System.out.println() ; 
            
            // print spaces for the dashes 
            z1DW = spacesDW ; 
            do {
                System.out.print(" ") ; 
                z1DW-- ; 
            } while (z1DW >= 0) ; 
            
            // print the dashes 
            y1DW = 0 ; 
            do {
                System.out.print("-") ; 
                y1DW++ ; 
            } while (y1DW < xDW * 2 - 1) ; 
            
            System.out.println () ; 
            
            xDW++ ; 
            spacesDW-- ; 
        } while (xDW <= number) ; 
    } // end main method
    
} // end class