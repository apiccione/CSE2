////////////////////////////////////////////////////////////
// Anthony Piccione
// [CSE 002]
// Homework 04 - Program #2: Days in Month Calculator 
// September 23, 2014

// import scanner 
import java.util.Scanner ; 

// add class 
public class Month {
    
    // add main method 
    public static void main(String [] args) {
        
        // declare instance of scanner object 
        Scanner myScanner ; 
        
        // call scanner constructor 
        myScanner = new Scanner(System.in) ; 
        
        // declare the days in each month 
        int janDays = 31 ;  
        int febDays = 28 ;  
        int febDaysLeap = 29 ;  
        int marDays = 31 ;  
        int aprDays = 30 ;  
        int mayDays = 31 ; 
        int junDays = 30 ;
        int julDays = 31 ;
        int augDays = 31 ;
        int sepDays = 30 ;
        int octDays = 31 ;
        int novDays = 30 ;
        int decDays = 31 ;
        
        // call for user input 
        System.out.print("Enter an int giving the number of the month (1-12): ") ;
        int Month ; 
        
        // check that it is an int
        if (myScanner.hasNextInt ()) {
        Month = myScanner.nextInt () ; 
        } // close if statement
        else {
            System.out.println("You did not enter an int.") ; 
            return ; 
        } // close else statement
        // check that the number is between 1-12
        if (Month < 1 || Month > 12) {
            System.out.println("You did not enter an int between 1-12.") ; 
        } // close if statement 
        
        // if statements for each month 
        if (Month == 1) {
            System.out.println("The month has " + janDays + " days.") ; 
        } //close if statement
        if (Month == 2) {
            System.out.print("Enter an int giving the year: ") ; 
            int Year ; 
            if (myScanner.hasNextInt()) {
            Year = myScanner.nextInt () ; 
            } // close if statement
            else {
                System.out.println("You did not enter an int.") ; 
            return ;   
            } // close else statement
            if (Year < 0) {
                System.out.println("You did not enter a positive int.") ;
            } // close if statement
            if ((Year % 4) ==0) {
                System.out.println("The month has " + febDaysLeap + " days.") ; 
            } // close if statement 
            else {
                System.out.println("The month has " + febDays + " days.") ; 
            } // close else statement 
        } //close if statement
        if (Month == 3) {
            System.out.println("The month has " + marDays + " days.") ; 
        } //close if statement
        if (Month == 4) {
            System.out.println("The month has " + aprDays + " days.") ; 
        } //close if statement
        if (Month == 5) {
            System.out.println("The month has " + mayDays + " days.") ; 
        } //close if statement
        if (Month == 6) {
            System.out.println("The month has " + junDays + " days.") ; 
        } //close if statement
        if (Month == 7) {
            System.out.println("The month has " + julDays + " days.") ; 
        } //close if statement 
        if (Month == 8) {
            System.out.println("The month has " + augDays + " days.") ; 
        } //close if statement
        if (Month == 9) {
            System.out.println("The month has " + sepDays + " days.") ; 
        } //close if statement
        if (Month == 10) {
            System.out.println("The month has " + octDays + " days.") ; 
        } //close if statement
        if (Month == 11) {
            System.out.println("The month has " + novDays + " days.") ; 
        } //close if statement
        if (Month == 12) {
            System.out.println("The month has " + decDays + " days.") ; 
        } //close if statement
       
    } // end main method
    
} // end class 