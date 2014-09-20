/////////////////////////////////
// Anthony Piccione 
// [CSE 002] 
// September 19, 2014
// lab 04 - Big Mac Again 

// Import Scanner
import java.util.Scanner ; 

// Add class 
public class BigMacAgain {
    
    // main method required for every Java program 
    public static void main(String [] args) {
        
        // declare instance of the scanner object 
        Scanner myScanner ; 
        
        // call scanner constructer 
        myScanner = new Scanner(System.in) ; 
        
        // declare the price of a big mac and the price of fries 
        double priceBigMac = 2.22 ; 
        double priceFries = 2.15 ; 
        
        // prompt user for the number of big macs in the form of an int 
        System.out.print("Enter the number of Big Macs: ") ;
        int nBigMacs ; 
        // check user input if it is an int (f)
        if (myScanner.hasNextInt()) {
        nBigMacs = myScanner.nextInt () ;
        } // close if 
        else {
            System.out.println("You did not enter an int") ; 
            return ; //leaves the program, i.e. the program terminates 
        } //close else statement 
        
        // check to make sure the number entered is greater than zero (g)
        if (nBigMacs > 0) {
            // total price of Big Mac and formatting 
            double bigMacOrder$ = nBigMacs * priceBigMac ; 
            int bigMacOrderForm = (int) (bigMacOrder$ * 100) ; 
            System.out.println ("You ordered " + nBigMacs + " Big Macs for a cost of " +
                nBigMacs + " x $" + priceBigMac + " = $" + (bigMacOrderForm / 100.0)) ; 
        } // close if statement 
        else {
            System.out.println ("You did not enter an int > zero") ; 
            return ; 
        } // close else statement
        
        // total price of Big Mac and formatting 
        double bigMacOrder$ = nBigMacs * priceBigMac ; 
        int bigMacOrderForm = (int) (bigMacOrder$ * 100) ;
            
        System.out.print ("Do you want an order of fries (Y/y/N/n)? ") ; 
        
        String answer = myScanner.next() ; 
        
        if ((answer.equals("Y")) || (answer.equals ("y"))) {
            System.out.println("You ordered fries at a cost of $" + priceFries) ;   
            System.out.println("The total cost of the meal is $" + ((bigMacOrderForm / 100.0) + priceFries)) ; 
        } // end of if
        else if ((answer.equals("N")) || (answer.equals("n"))) {
            System.out.println ("The total cost of the meal is $" + (bigMacOrderForm / 100.0)) ; 
            } // end of else if statement 
        else { 
            System.out.println("You did not enter one of 'Y', 'y', 'N', 'n'.") ; 
            return ; 
        } // end of else statement 
        
    } // end of main method
} // end of class 