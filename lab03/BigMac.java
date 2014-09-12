//////////////////////////////////
//  Anthony Piccione 
//  [CSE2]
//  September 12, 2014
//  lab 03 - bigMac.java
//  Program computes the cost of buying a Big Mac by utilizing the scanner 

//Import Scanner 
import java.util.Scanner ; 

// Add class
public class BigMac {
    
    // Add Main Method
    public static void main (String [] args ) {
        
        // Declare an instance of the scanner object 
        Scanner myScanner ; 
        
        // Call scanner constructor 
        myScanner = new Scanner (System.in) ; 
        
        // Prompt the user for the number of the tickets 
        System.out.print("Enter the number of Big Macs (an integer > 0): ") ; 
        
        // Accept user input 
        int nBigMacs = myScanner.nextInt () ; 
        
        // Prompt the user for the cost of a Big Mac, sales tax and accept user input 
        System.out.print ("Enter the cost per Big Mac as" + " a double (in the form xx.xx): ") ; 
        double bigMac$ = myScanner.nextDouble () ; 
        System.out.print ("Enter the percent tax as a whole number (xx): ") ; 
        double taxRate = myScanner.nextDouble () ;
        
        // Converts the whole number the user enters into a proportion  
        taxRate = taxRate / 100 ; 
        
        //Print Output 
        double cost$ ; 
        // Storing digits 
        int dollars, 
            dimes, 
            pennies ; 
        
        cost$ = nBigMacs * bigMac$ * (1 + taxRate) ; 
        // Dollar amount  
        dollars = (int) cost$ ; 
        
        // Dimes Amount
        dimes = (int) (cost$ * 10) % 10 ; 
        
        // Pennies Amount 
        pennies = (int) (cost$ * 100) % 100 ;
        
        System.out.println ("The total cost of " + nBigMacs + " Big Macs, at $" + bigMac$ + " per Big Mac, with a sales tax of " + (int) (taxRate * 100) + "%, is $" + dollars + "." + dimes + pennies) ; 
        
        
        
    } // End of Main Method 
    
} // End of class 