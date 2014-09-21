////////////////////////////////////////////////////////////
// Anthony Piccione
// [CSE 002]
// Homework 04 - Program #1: Income Tax 
// September 23. 2014

// import scanner 
import java.util.Scanner ; 

// add class 
public class IncomeTax {
    
    // main method required for java programs 
    public static void main(String [] args) { 
       
        // declare instance of the scanner object 
        Scanner myScanner ; 
        
        // call scanner constructer 
        myScanner = new Scanner(System.in) ;  
        
        // declare tax rates 
        double tax20 = .05 ; 
        double tax40 = .07 ; 
        double tax78 = .12 ; 
        double tax78plus = .14 ; 
        
        // prompt user to enter income 
        System.out.print("Enter an int giving the number of thousands: ") ; 
        int income ; 
        
        // check to make sure user enters an int 
        if (myScanner.hasNextInt()) {
            income = myScanner.nextInt () ; 
        } //close if statement 
        else {
            System.out.println("You did not enter an int") ; 
            return ; //end the program
        } //close else statement 
        
        // multiply income by 1000
        int income2 = income * 1000 ; 
        
        if (income <= 0) { 
            System.out.println("You did not enter a positive int") ; 
        } // close if statement 
        else if (income < 20) {
            // income tax math and formatting
            double taxon20 = income2 * tax20 ; 
            int taxon20form = (int) (taxon20 * 100) ; 
            int tax20form = (int) ((tax20 * 100) * 100) ; 
            //print out the statement 
            System.out.println("The tax rate on $" + income2 + " is " + (tax20form / 100.0) + "%, and the tax is $" + (taxon20form / 100.0)) ; 
        } // close else if statement 
        
        else if((income >= 20) && (income < 40)) {
            // income tax math and formatting
            double taxon40 = income2 * tax40 ; 
            int taxon40form = (int) (taxon40 * 100) ; 
            int tax40form = (int) ((tax40 * 100) * 100) ;
            //print out the statement 
            System.out.println("The tax rate on $" + income2 + " is " + (tax40form / 100.0) + "%, and the tax is $" + (taxon40form / 100.0)) ; 
        } //close else if statement 
        
        else if((income >= 40) && (income < 78)) {
            // income tax math and formatting
            double taxon78 = income2 * tax78 ; 
            int taxon78form = (int) (taxon78 * 100) ; 
            int tax78form = (int) ((tax78 * 100) * 100) ;
            //print out the statement 
            System.out.println("The tax rate on $" + income2 + " is " + (tax78form / 100.0) + "%, and the tax is $" + (taxon78form / 100.0)) ;
        } // close else if statement 
        
         else if (income > 78) {
            // income tax math and formatting
            double taxon78plus = income2 * tax78plus ; 
            int taxon78plusform = (int) (taxon78plus * 100) ; 
            int tax78plusform = (int) ((tax78plus * 100) * 100) ;
            //print out the statement 
            System.out.println("The tax rate on $" + income2 + " is " + (tax78plusform / 100.0) + "%, and the tax is $" + (taxon78plusform / 100.0)) ;
        }// close else if statement 
        
    } // end main method
    
} // end class 