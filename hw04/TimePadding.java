////////////////////////////////////////////////////////////
// Anthony Piccione
// [CSE 002]
// Homework 04 - Program #4: Time Conversion with Padded Zeros 
// September 23, 2014

// import scanner 
import java.util.Scanner ; 

// add class 
public class TimePadding { 
    
    // add main method 
    public static void main(String [] args) {
        
        // declare instance of scanner object 
        Scanner myScanner ; 
        
        // call scanner constructor 
        myScanner = new Scanner(System.in) ; 
        
        // prompt user for input 
        System.out.print ("Enter the time in seconds: ") ; 
        int time ; 
        
        // check that the input is an int
        if (myScanner.hasNextInt ()) {
        time = myScanner.nextInt () ; 
        } // end if statement 
        else {
            System.out.println ("You did not enter an int.") ; 
            return ; 
        } // end else statement 
        
        // check that the input is positive
        if (time < 0) {
            System.out.println ("You did not enter a positive int.") ; 
        } // end if statemnt 
        
        // strip hours 
        int timeHours = (int) ((time / 60 / 60) - (time % (60 / 60))) ; 
        
        // strip minutes 
        int timeMinutes = (int) ((time - (timeHours * 60 * 60)) / 60) ; 
        
        // strip seconds 
        int timeSeconds = (int) (time - ((timeHours * 60 * 60) + (timeMinutes * 60))) ; 
        
        // pad the times 
        if (timeSeconds < 10 && timeMinutes < 10) {
            System.out.println ("The time is:  " + timeHours + ":" + 0 + timeMinutes + ":" + 0 + timeSeconds) ; 
        } // end if statement
        else if (timeSeconds < 0 && timeMinutes > 0) {
            System.out.println ("The time is:  " + timeHours + ":" + timeMinutes + ":" + 0 + timeSeconds) ;
        } // end else if statement 
        else if (timeSeconds > 0 && timeMinutes < 0) {
            System.out.println ("The time is:  " + timeHours + ":" + 0 + timeMinutes + ":" + timeSeconds) ;
        } // end else if statement 
        else {
          System.out.println ("The time is:  " + timeHours + ":"  + timeMinutes + ":" + timeSeconds) ;  
        } // end else statement
       
    } // end main method
    
} // end class